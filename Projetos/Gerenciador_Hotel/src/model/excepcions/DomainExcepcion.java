package model.excepcions;

public class DomainExcepcion extends RuntimeException{
    private static final long serialVersionUID = 1L;
    
    public DomainExcepcion(String msg){
        super(msg);
    }
    
}
