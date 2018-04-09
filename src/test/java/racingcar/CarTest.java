//package racingcar;
//
//import org.junit.Test;
//
//import static org.junit.Assert.assertThat;
//
//public class CarTest {
//    @Test
//    public void 이동() {
//        Car car = new Car();
//        int result = car.move(new MoveStrategy() {
//            @Override
//            public boolean isMovale() {
//                return true;
//            }
//        });
//        assertThat(result).isEqualTo(1);
//    }
//
//    @Test
//    public void 정지() {
//        Car car = new Car();
//        int result = car.move(new MoveStrategy() {
//            @Override
//            public boolean isMovale() {
//                return false;
//            }
//        });
//        assertThat(result).isEqualTo(0);
//    }
//}
