import java.util.Map;

public class FetchAllEnvVar {
        public static void main(String[] args) {
                Map<String, String> allEnv = System.getenv();

                for (Map.Entry<String, String> entry : allEnv.entrySet()) {
                        System.out.println(entry);
                }
        }
}
