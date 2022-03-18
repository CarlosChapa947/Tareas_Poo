public class Family<T extends Creatura>{
    private T Father, Mother;
    private T child[];

    public Family(T father, T Mother, T childs[]) {
        this.Father = father;
        this.Mother = Mother;
        this.child = childs;
    }

    public T getFather(){
        return this.Father;
    }

    public T getMother(){
        return this.Mother;
    }

    public T getChild(int i){
        return this.child[i];
    }
}
