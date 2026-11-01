#include <jni.h>
#include <string>
#include <regex>
#include <sstream>
#include <vector>

extern "C" JNIEXPORT jstring JNICALL
Java_com_mkindustries_scanner_ScannerEngine_parseSmartResult(
    JNIEnv* env, jobject, jstring rawInput) {
    // ...
}
