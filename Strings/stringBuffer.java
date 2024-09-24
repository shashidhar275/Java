public class stringBuffer{
    public static void main(String args[]){
        StringBuffer sb = new StringBuffer("Shashidhar");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append(" Angadi");
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);

        sb.deleteCharAt(2);
        System.out.println(sb);

        sb.insert(0,"Goat ");
        System.out.println(sb);

        sb.setLength(30);
        System.out.println(sb);
        sb.ensureCapacity(100);

        System.out.println(sb.capacity());
    }
}