# Prevent Proguard from inlining methods that are intentionally extracted to ensure locals have a
# constrained liveness scope by the GC. This is needed to avoid keeping previous request references
# alive for an indeterminate amount of time. See also https://github.com/google/volley/issues/114
-keepclassmembers,allowshrinking,allowobfuscation class com.zeoflow.z.stream.NetworkDispatcher {
    void processRequest();
}
-keepclassmembers,allowshrinking,allowobfuscation class com.zeoflow.z.stream.CacheDispatcher {
    void processRequest();
}
