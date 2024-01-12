import android.view.View;
import android.content.Context;
import android.view.inputmethod.InputMethodManager;
import android.app.Activity;

public class SlintAndroidJavaHelper  {

    public static void show_keyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager)activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.showSoftInput(activity.getWindow().getDecorView(), 0);
    }

    public static void hide_keyboard(Activity activity) {
        InputMethodManager imm = (InputMethodManager)activity.getSystemService(Context.INPUT_METHOD_SERVICE);
        imm.hideSoftInputFromWindow(activity.getWindow().getDecorView().getWindowToken(), 0);
    }

}
