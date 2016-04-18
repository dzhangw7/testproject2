package tests;

import android.test.ActivityInstrumentationTestCase2;
import android.text.style.TextAppearanceSpan;
import android.widget.TextView;

import com.londonappdeveloper.testproject.MainActivity;
import com.londonappdeveloper.testproject.R;

/**
 * Created by Daniel on 4/17/2016.
 */
public class JUnit_test extends ActivityInstrumentationTestCase2<MainActivity> {

    MainActivity mainActivity;
    public JUnit_test() {
        super(MainActivity.class);
    }

    public void test_first() {
        mainActivity = getActivity();

        TextView textView = (TextView) mainActivity.findViewById(R.id.tv1);
        String tester = textView.getText().toString();

        assertEquals("Hello World!", tester);
    }
}
