package pl.project13.jo.api;

// todo well, it's more like a file as of now I guess...
public interface JoPackage {

  public boolean isRunnable();

  public Runnable asRunnable() throws ClassCastException;

  public <T> T callUnsafe(String name, Class<T> forResult) throws ClassCastException;
}
