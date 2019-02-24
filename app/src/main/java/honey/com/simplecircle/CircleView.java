package honey.com.simplecircle;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

public class CircleView extends View {
    Paint paint;

    public CircleView(Context context) {
        super(context);
        init();
    }

    public CircleView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();

    }

    public CircleView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init();

    }

    @Override
    protected void onDraw(Canvas canvas) {

        canvas.drawCircle(200,200,100,paint);
    }

    private void init(){
        paint = new Paint();
        paint.setColor(Color.BLUE);
    }
}
