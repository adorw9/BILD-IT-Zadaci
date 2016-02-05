package Zadaci_04_02_2016;

/**
 * @author Adnan Brièiæ
 *
 */
/*
 * Stopwatch
 */
public class z_3 {
	// osobine
	private long startTime;
	private long endTime;

	// konstruktor
	public z_3() {
		startTime = System.currentTimeMillis();
	}

	// metode
	public long getStartTime() {
		return startTime;
	}

	public long getEndTime() {
		return endTime;
	}

	public long start() {
		return startTime = System.currentTimeMillis();
	}

	public long stop() {
		return endTime = System.currentTimeMillis();
	}

	public double getElapsedTime() {
		return (endTime - startTime) / 1000.0;
	}
}
