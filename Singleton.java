/**
 * Created by fantasy on 18-8-17.
 * Email:591888356@qq.com
 */

public abstract class Singleton<T> {
    private T mInstance;

    protected abstract T create();

    public final T get()
    {
        if (mInstance == null) {
            synchronized (this) {
                if (mInstance == null) {
                    mInstance = create();
                }
            }
        }
        return mInstance;
    }
}
