package Objects;

public class BlackObject {
    private Color color = Color.BLACK;
    
    public String toString() {
        return "somthing black";
    }
    @Override
    public boolean equals(Object o){
        if(this == o) {
            return true;
        }
        if(o == null || this.getClass() != o.getClass()){
            return false;
        }
        return true;
    }
    
    @Override
    public int hashCode() {
        return 1;
    }
    
}


