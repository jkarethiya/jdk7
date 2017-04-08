/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.jk.jdk.core.keyword;

/**
 *
 * @author Jitendra
 */
import java.util.Random;

//import org.junit.*;

public class SwitchVsIf {
    /*

  private static final int[] values = new int[] { 1, 2, 3 };
  private static final float[] probs = new float[] { 0.6f, 0.9f, 1.0f };
  private static int[] data;
  private static final int DATA_SIZE = 1000000;
  private static final int N = 10000;
  private static final Random random = new Random();
  private long count1, count2, count3, countErrors;
  private long startTime;
  private long endTime;

  @BeforeClass
  public static void loadData() {
    data = new int[DATA_SIZE];
    for (int i = 0; i < DATA_SIZE; i++) {
      data[i] = getValue();
    }
  }

  private static int getValue() {
    double prob = random.nextFloat();
    for (int i=0; i < probs.length; i++) {
      if (prob <= probs[i]) return values[i];
    }
    return Integer.MAX_VALUE;
  }

  @Before
  public void before() {
    count1 = 0;
    count2 = 0;
    count3 = 0;
    countErrors = 0;
    startTime = System.currentTimeMillis();
  }

  @After
  public void after() {
    endTime = System.currentTimeMillis();
    System.out.println("time: " + (endTime - startTime));
    System.out.println("count1: " + count1);
    System.out.println("count2: " + count2);
    System.out.println("count3: " + count3);
    System.out.println("countErrors: " + countErrors);
    System.out.println();
  }

  @Test
  public void testIf() {
    for (int i = 0; i < N; i++) {
      for (int value : data) {
        if (value == 1) {
          count1++;
        } else if (value == 2) {
          count2++;
        } else if (value == 3) {
          count3++;
        } else {
          countErrors++;
        }
      }
    }
  }

  @Test
  public void testTableSwitch() {
    for (int i = 0; i < N; i++) {
      for (int value : data) {
        switch (value) {
          case 4:
            countErrors++;
            break;
          case 1:
            count1++;
            break;
          case 2:
            count2++;
            break;
          case 3:
            count3++;
            break;
          default:
            countErrors++;
        }
      }
    }
  }

  @Test
  public void testLookupSwitch() {
    for (int i = 0; i < N; i++) {
      for (int value : data) {
        switch (value) {
          case 1000000:
            countErrors++;
            break;
          case 1:
            count1++;
            break;
          case 2:
            count2++;
            break;
          case 3:
            count3++;
            break;
          default:
            countErrors++;
        }
      }
    }
  }

  // repeat tests to see how stable the results really are:

  @Test public void testIf2() { testIf(); }
  @Test public void testTableSwitch2() { testTableSwitch(); }
  @Test public void testLookupSwitch2() { testLookupSwitch(); }
  @Test public void testIf3() { testIf(); }
  @Test public void testTableSwitch3() { testTableSwitch(); }
  @Test public void testLookupSwitch3() { testLookupSwitch(); }

*/

}
