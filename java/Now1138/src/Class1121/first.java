package Class1121;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class first {
    public static void main(String[] args) {
        Calendar ca=Calendar.getInstance();
        System.out.println(ca.get(Calendar.YEAR));
        System.out.println(ca.get(Calendar.MONTH)+1);
        System.out.println(ca.get(Calendar.DATE));

        SimpleDateFormat  sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日 hh点mm分ss秒");
        try {
            String str=ca.get(Calendar.YEAR)+"-"+(ca.get(Calendar.MONTH)+1)+"-"+ca.get(Calendar.DATE)+" "+ca.get(Calendar.HOUR)+":"+ca.get(Calendar.MINUTE)+":"+ca.get(Calendar.SECOND);
            Date date = sdf.parse(str);

            System.out.println(sdf2.format(date));  //输出2008年12月23日 12点

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
