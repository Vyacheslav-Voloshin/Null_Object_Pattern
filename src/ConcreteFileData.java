public class ConcreteFileData implements FileData{

    private boolean ishidden;

    private boolean isexecutable;

    private boolean isdirectory;

    private boolean iswritable;

    public ConcreteFileData(boolean ishidden, boolean isexecutable, boolean isdirectory, boolean iswritable) {
        this.ishidden = ishidden;
        this.isexecutable = isexecutable;
        this.isdirectory = isdirectory;
        this.iswritable = iswritable;
    }

    @Override
    public boolean isHidden() {
        return false;
    }

    @Override
    public boolean isExecutable() {
        return false;
    }

    @Override
    public boolean isDirectory() {
        return false;
    }

    @Override
    public boolean isWritable() {
        return false;
    }
}
