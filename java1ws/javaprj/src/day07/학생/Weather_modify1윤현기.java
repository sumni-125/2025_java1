package day07.학생;
// 2. 날씨정보를 반환하는 함수 만들기 (임의의 날씨 정보)
import java.util.Random;

public class Weather_modify1윤현기 {
        // 날씨 정보를 문자열로 반환하는 함수
        public static String getWeatherInfo() {
            Random random = new Random();

            // 가능한 날씨 상태들
            String[] weathers = {"맑음", "흐림", "비", "눈", "태풍"};

            // 랜덤 값들 생성

            // ⭐️ weathers의 맑음 흐림 비 눈 태풍 중 랜덤으로 하나의 값을 뽑아옴
            String weather = weathers[random.nextInt(weathers.length)];

            int temperature = random.nextInt(46) - 10;  // 기온 : -10 ~ 35도

            int humidity = random.nextInt(71) + 30;     // 습도 : 30 ~ 100%

            double rainfall = Math.round(random.nextDouble() * 50 * 10) / 10.0;  // 강수량 : 0 ~ 50mm

            // 날씨 정보 문자열 생성
            return String.format("현재 날씨: %s\n기온: %d°C\n습도: %d%%\n강수량: %.1fmm",
                    weather, temperature, humidity, rainfall);
        }

        // 도시의 날씨 정보를 반환하는 함수
        public static String getCityWeather(String city) {
            return city + "의 날씨 정보:\n" + getWeatherInfo();
        }

        public static void main(String[] args) {
            // 기본 날씨 정보 출력
            System.out.println("=== 현재 날씨 정보 ===");
            System.out.println(getWeatherInfo());

            // 도시별 날씨 정보 출력
            System.out.println("\n=== 도시별 날씨 정보 ===");
            String[] cities = {"서울", "부산", "제주"};

            for (String city : cities) {
                System.out.println("\n" + getCityWeather(city));
            }
        }
    }
