package samples

import org.junit._
import Assert._
import au.com.nuvento.demo.App

@Test
class AppTest {

    @Test
    def testAdd() = {
        val result = App.add(1, 2)
        assertEquals(3, result)
    }

}


