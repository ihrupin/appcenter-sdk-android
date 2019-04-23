package com.microsoft.appcenter.data;

/**
 * Constants defining time-to-live in seconds.
 */
public final class TimeToLive {

    /**
     * Cache does not expire.
     */
    public static final int INFINITE = -1;

    /**
     * Do not cache documents.
     */
    public static final int NO_CACHE = 0;

    /**
     * Default caching value of one day (in seconds).
     */
    public static final int DEFAULT = 60 * 60 * 24;
}
