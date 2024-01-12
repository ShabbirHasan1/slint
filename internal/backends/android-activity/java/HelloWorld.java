import android.view.View;
import android.content.Context;

public class HelloWorld extends View {
    public HelloWorld(Context context)
    {
        super(context);
    }



    public static void hello(String name) {
        System.out.println("Hello ");
        System.out.println(name);
    }

}
