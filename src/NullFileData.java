import java.util.concurrent.Executors;

public class NullFileData implements FileData {

    private Exception exeception;

    public NullFileData(Exception exeception) {
        this.exeception = exeception;
    }

    public Exception getExeception() {
        return exeception;
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
