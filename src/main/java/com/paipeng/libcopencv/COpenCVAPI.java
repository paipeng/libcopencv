package com.paipeng.libcopencv;

import com.sun.jna.Library;
import com.sun.jna.Native;
import com.sun.jna.NativeLibrary;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class COpenCVAPI {
    public static Logger logger = LoggerFactory.getLogger(COpenCVAPI.class);
    private static final String LIB_NAME = "copencv";

    private static COpenCVAPI INSTANCE;

    public static COpenCVAPI getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new COpenCVAPI();
        }

        return INSTANCE;
    }

    private static void setupNativeLibrary() {
        logger.trace("setupNativeLibrary");
        NativeLibrary.addSearchPath(LIB_NAME, "./libs");
    }

    static {
        setupNativeLibrary();
    }

    //Load DLL Library
    public interface OpenCVLib extends Library {
        OpenCVLib INSTANCE = Native.load(LIB_NAME, OpenCVLib.class);

        int add(int a, int b);
    }

    public int add(int a, int b) {
        return OpenCVLib.INSTANCE.add(a, b);
    }
}
