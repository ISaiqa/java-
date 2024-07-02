package strings.stringBuild;

public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");
        sb.append("World");
        System.out.println(sb);
        sb.setCharAt(5, ' ');
        System.out.println(sb);
        sb.setCharAt(5, 'w');
        System.out.println(sb);
        sb.insert(5,' ');
        System.out.println(sb);
        sb.append(2);
        System.out.println(sb);
        sb.insert(11,' ');
        System.out.println(sb);
        System.out.println(sb.length());

        
        
    }

}
