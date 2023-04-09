package tp03.ejercicio1;

import tp02.ejercicio3.ColaGenerica;

public class ArbolBinario<T> {
	private T dato;
	private ArbolBinario<T> hijoIzquierdo;   
	private ArbolBinario<T> hijoDerecho;
        private int retardo;

	
	public ArbolBinario() {
		super();
	}

        public ArbolBinario(T dato) {
            this.dato = dato;
        }

        
	public ArbolBinario(T dato,int retardo) {
		this.dato = dato;
                this.retardo=retardo;
	}

	/*
	 * getters y setters
	 * 
	 */
	public T getDato() {
		return dato;
	}

	public void setDato(T dato) {
		this.dato = dato;
	}
	
	/**
	 * Preguntar antes de invocar si tieneHijoIzquierdo()
	 * @return
	 */
	public ArbolBinario<T> getHijoIzquierdo() {
		return this.hijoIzquierdo;
	}

	public ArbolBinario<T> getHijoDerecho() {
		return this.hijoDerecho;

	}

        public int getRetardo() {
            return retardo;
        }

        public void setRetardo(int retardo) {
            this.retardo = retardo;
        }
        
	public void agregarHijoIzquierdo(ArbolBinario<T> hijo) {
		this.hijoIzquierdo = hijo;
	}

	public void agregarHijoDerecho(ArbolBinario<T> hijo) {
		this.hijoDerecho = hijo;
	}

	public void eliminarHijoIzquierdo() {
		this.hijoIzquierdo = null;
	}

	public void eliminarHijoDerecho() {
		this.hijoDerecho = null;
	}

	public boolean esVacio() {
		return this.getDato() == null && !this.tieneHijoIzquierdo() && !this.tieneHijoDerecho();
	}

	public boolean esHoja() {
		return (!this.tieneHijoIzquierdo() && !this.tieneHijoDerecho());

	}

	@Override
	public String toString() {
		return this.getDato().toString();
	}

	 
	public boolean tieneHijoIzquierdo() {
		return this.hijoIzquierdo!=null;
	}

	 
	public boolean tieneHijoDerecho() {
		return this.hijoDerecho!=null;
	}

	public int contarHojas() {
            if(!esVacio()){
		if(esHoja()){
                    return 1;
                }else{
                    int cant=0;
                    if(tieneHijoIzquierdo()){
                        cant+=getHijoIzquierdo().contarHojas();
                    }
                    if(tieneHijoDerecho()){
                        cant+=getHijoDerecho().contarHojas();
                    }
                    return cant;
                }
            }
            return 0;
	}
	

        public ArbolBinario<T> espejo() {
            if(!esVacio()){
                ArbolBinario<T>aux=new ArbolBinario(this.dato);
                if(!esHoja()){
                    if(tieneHijoIzquierdo()){
                        aux.agregarHijoDerecho(this.getHijoIzquierdo().espejo());
                    }
                    if(tieneHijoDerecho()){
                        aux.agregarHijoIzquierdo(this.getHijoDerecho().espejo());
                    }
                }
                return aux;
            }
            return null;
	}
        
        
	public void entreNiveles(int n, int m){
            if((n>=0)&&(m>=0)&&(n<=m)){
                int aux=0;
                ArbolBinario<T>arbol=null;
                ColaGenerica<ArbolBinario<T>>cola=new ColaGenerica<ArbolBinario<T>>();
                cola.encolar(this);
                cola.encolar(null);
                while((!cola.esVacia())&&(aux<=m)){
                    arbol=cola.desencolar();
                    if(arbol!=null){
                        if(n<=aux){
                            System.out.println(arbol.getDato());
                        }
                        if(arbol.tieneHijoIzquierdo()){
                            cola.encolar(arbol.getHijoIzquierdo());
                        }
                        if(arbol.tieneHijoDerecho()){
                            cola.encolar(arbol.getHijoDerecho());
                        }
                    }else if(!cola.esVacia()){
                        System.out.println();
                        cola.encolar(null);
                        aux++;
                    }
                }
            }else{
                System.out.println("Los valores ingresados no son validos");
            }
	}

	

}
