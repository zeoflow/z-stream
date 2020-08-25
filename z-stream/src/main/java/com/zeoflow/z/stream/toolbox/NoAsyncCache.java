package com.zeoflow.z.stream.toolbox;

import com.zeoflow.z.stream.AsyncCache;
import com.zeoflow.z.stream.Cache;

/** An AsyncCache that doesn't cache anything. */
public class NoAsyncCache extends AsyncCache {
    @Override
    public void get(String key, OnGetCompleteCallback callback) {
        callback.onGetComplete(null);
    }

    @Override
    public void put(String key, Cache.Entry entry, OnWriteCompleteCallback callback) {
        callback.onWriteComplete();
    }

    @Override
    public void clear(OnWriteCompleteCallback callback) {
        callback.onWriteComplete();
    }

    @Override
    public void initialize(OnWriteCompleteCallback callback) {
        callback.onWriteComplete();
    }

    @Override
    public void invalidate(String key, boolean fullExpire, OnWriteCompleteCallback callback) {
        callback.onWriteComplete();
    }

    @Override
    public void remove(String key, OnWriteCompleteCallback callback) {
        callback.onWriteComplete();
    }
}
