package com.patrones.common;

import com.patrones.util.FileCustomUtil;
import com.patrones.util.Logger;
import org.springframework.stereotype.Service;

@Service
public class ProxyLogger {

    private static final String URL_ARCHIVO = "URL archivo";

    public void info(String info) {
        Logger.info(info);
        FileCustomUtil.escribirArchivo(URL_ARCHIVO, info);
    }

}
