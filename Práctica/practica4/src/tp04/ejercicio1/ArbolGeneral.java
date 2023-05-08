package tp04.ejercicio1;

import tp02.ejercicio2.ListaEnlazadaGenerica;
import tp02.ejercicio2.ListaGenerica;
import tp02.ejercicio3.ColaGenerica;

public class ArbolGeneral<T> {

	private T dato;

	private ListaGenerica<ArbolGeneral<T>> hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();

	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}

	public void setHijos(ListaGenerica<ArbolGeneral<T>> hijos) {
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ArbolGeneral(T dato) {
		this.dato = dato;
	}

	public ArbolGeneral(T dato, ListaGenerica<ArbolGeneral<T>> hijos) {
		this(dato);
		if (hijos==null)
			this.hijos = new ListaEnlazadaGenerica<ArbolGeneral<T>>();
		else
			this.hijos = hijos;
	}

	public ListaGenerica<ArbolGeneral<T>> getHijos() {
		return this.hijos;
	}

	public void agregarHijo(ArbolGeneral<T> unHijo) {

		this.getHijos().agregarFinal(unHijo);
	}

	public boolean esHoja() {

		return !this.tieneHijos();
	}
	
	public boolean tieneHijos() {
		return !this.hijos.esVacia();
	}
	
	public boolean esVacio() {

		return this.dato == null && !this.tieneHijos();
	}

	

	public void eliminarHijo(ArbolGeneral<T> hijo) {
		if (this.tieneHijos()) {
			ListaGenerica<ArbolGeneral<T>> hijos = this.getHijos();
			if (hijos.incluye(hijo)) 
				hijos.eliminar(hijo);
		}
	}
	
	public ListaEnlazadaGenerica<T> preOrden() {
		return null;
	}
	
	public Integer altura() {
            if(esVacio()){
                return -1;
            }else if(esHoja()){
                return 0;
            }else{
                Integer max=-1;
                ListaGenerica<ArbolGeneral<T>> l=getHijos();
                l.comenzar();
                while(!l.fin()){
                    Integer aux=1+l.proximo().altura();
                    max=Math.max(max, aux);
                }
                return max;   
                
            }
	}

	public Integer nivel(T dato) {
            int nivel=0;
            ColaGenerica<ArbolGeneral<T>> cola= new ColaGenerica();
            ArbolGeneral<T> arbol_aux;
            cola.encolar(this);
            cola.encolar(null);
            while (!cola.esVacia()){
                arbol_aux = cola.desencolar();
                if(arbol_aux!=null){
                    if(arbol_aux.getDato()==dato){
                        return nivel;
                    }else if (arbol_aux.tieneHijos()) {
                        ListaGenerica<ArbolGeneral<T>> hijos = arbol_aux.getHijos();
                        hijos.comenzar();
                        while (!hijos.fin()) {
                            cola.encolar(hijos.proximo());
                        }
                    }
                }else if(!cola.esVacia()){
                    nivel++;
                    cola.encolar(null);
                }
            }
            return -1;
        }

	public Integer ancho() {
            int max=-1;
            int cant=0;
            ColaGenerica<ArbolGeneral<T>> cola= new ColaGenerica();
            ArbolGeneral<T> arbol_aux;
            cola.encolar(this);
            cola.encolar(null);
            while (!cola.esVacia()) {
                arbol_aux = cola.desencolar();
                if(arbol_aux!=null){
                    cant++;
                    if (arbol_aux.tieneHijos()) {
                        ListaGenerica<ArbolGeneral<T>> hijos = arbol_aux.getHijos();
                        hijos.comenzar();
                        while (!hijos.fin()) {
                            cola.encolar(hijos.proximo());
                        }
                    }
                }else{
                    max=Math.max(max, cant);
                    if(!cola.esVacia()){
                        cant=0;
                        cola.encolar(null);
                    }
                }
            }
            return max;
	}
        
        
        private ArbolGeneral<T> buscarNodo(ArbolGeneral<T>arb,T a){
            ArbolGeneral<T> aux=new ArbolGeneral(null);
            if(arb.getDato()==a){
                return arb;
            }else if(arb.tieneHijos()){
                ListaGenerica<ArbolGeneral<T>>hijos=arb.getHijos();
                hijos.comenzar();
                while(!hijos.fin()){
                    aux= buscarNodo(hijos.proximo(), a);
                    if(!aux.esVacio()){
                        return aux;
                    }
                }
            }
            return aux;
        }
        
        public Boolean esAncestro(T a,T b){
            if(!this.esVacio()){
                ArbolGeneral<T>aux=buscarNodo(this,a);
                if(!aux.esVacio()){
                    aux=buscarNodo(aux,b);
                    if(!aux.esVacio()){
                        return true;
                    }
                }
            }
            return false;
        }
        

}