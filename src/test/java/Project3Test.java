import customLock.ReentrantReadWriteLockTest;
import hotelapp.HotelDataTest;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
            HotelDataTest.class,
            ReentrantReadWriteLockTest.class,
    })

public class Project3Test {
        // Just "coordinates" the work of two other testers
}

