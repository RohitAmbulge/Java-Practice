public class IPv4_to_IPv6 {

    public static String toIpv6(String ipv4){
        return "::ffff:"+ipv4;
    }

    public static String toIpv6Hex(String ipv4){
        int num = 0;
        int count = 0;

        char [] hexMap = "0123456789ABCDEF".toCharArray();
        StringBuilder result = new StringBuilder("::ffff:");

        for(int i=0;i<=ipv4.length();i++){

            if(i == ipv4.length() || ipv4.charAt(i) == '.'){
                result.append(hexMap[num/16]);
                result.append(hexMap[num % 16]);

                count++;

                if(count == 2){
                    result.append(':');
                    
                }

                num = 0;
            }
            else{
                num = num * 10 + (ipv4.charAt(i) - '0');
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String ipv4 = "192.168.1.1";

        System.out.println("IPV6: "+toIpv6(ipv4));
        System.out.println("Hex IPV6: "+toIpv6Hex(ipv4));
    }
}