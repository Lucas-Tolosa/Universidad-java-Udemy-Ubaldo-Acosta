package paquete1;

 class Clase1 {
     private String atributoPrivado="valor atributo Privado";
    
     private Clase1(){
        System.out.println("Constructor Privado");
       
    }
   public Clase1(String arg){
       this();
       System.out.println("constructor publico");
      
   }
    
   private void metodPrivado(){
        System.out.println("metodo privado");
    }

    public String getAtributoPrivado() {
        return this.atributoPrivado;
    }

    public void setAtributoPrivado(String atributoPrivado) {
        this.atributoPrivado = atributoPrivado;
    }
   
   
}
