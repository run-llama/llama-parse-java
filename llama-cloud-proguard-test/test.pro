# Specify the entrypoint where ProGuard starts to determine what's reachable.
-keep class ai.llamaindex.llamacloud.proguard.** { *; }

# For the testing framework.
-keep class org.junit.** { *; }

# Many warnings don't apply for our testing purposes.
-dontnote
-dontwarn