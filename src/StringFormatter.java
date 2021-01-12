public class StringFormatter {
    public static void main(String[] args) {
        StringFormatter stringFormatter = new StringFormatter();

        String result1 = stringFormatter.truncate("When all mankind shall receive the same opportunity of education and the equality of men and women be realized, the foundations of war will be utterly destroyed.");
        String result2 = stringFormatter.truncate("Equality");

        System.out.println(result1);
        System.out.println(result2);

    }
    public String truncate(String original){
        int length = original.length();
        String result = original;
        if(length > 30){
            String beginning = original.substring(0, 27);
            result = beginning + "...";
        }
        return result;
    }
}
