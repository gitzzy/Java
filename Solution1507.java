public class Solution1507 {
    public static void main(String[] args) {

        String date = "6th Jun 1933";
        System.out.println("Format : " + reformatDate(date));
    }

    public static String reformatDate(String date) {

        String day;
        int rMon = 0;
        String mon = String.valueOf(date.charAt(date.length() - 8)) + String.valueOf(date.charAt(date.length() - 7))
                + String.valueOf(date.charAt(date.length() - 6));
        String year = String.valueOf(date.charAt(date.length() - 4)) + String.valueOf(date.charAt(date.length() - 3))
                + String.valueOf(date.charAt(date.length() - 2)) + String.valueOf(date.charAt(date.length() - 1)) + "-";
        String[] options = { "", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

        if (Character.isDigit(date.charAt(1))) {

            day = "-" + String.valueOf(date.charAt(0)) + String.valueOf(date.charAt(1));
        } else {
            day = "-0" + String.valueOf(date.charAt(0));
        }

        for (int i = 0; i < options.length; i++) {
            if (mon.equals(options[i])) {
                rMon = i;
                break;
            } else {
                rMon = 0;
            }

        }
        String rMons;
        if (rMon < 10) {
            rMons = "0" + String.valueOf(rMon);
        } else {
            rMons = String.valueOf(rMon);
        }

        return year + rMons + day;
    }
}
