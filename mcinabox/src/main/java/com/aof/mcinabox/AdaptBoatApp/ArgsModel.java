package com.aof.mcinabox.AdaptBoatApp;

import java.io.Serializable;

public class ArgsModel implements Serializable {
    String[] args; //全部启动参数
    Boolean forceRootRuntime; //强制运行库提权
    Boolean notEnableVirtualKeyboard; //不启用虚拟键盘
    Boolean doEnableOTG; //启用OTG

    public String[] getArgs() {
        return args;
    }

    public void setArgs(String[] args) {
        this.args = args;
    }

    public Boolean getForceRootRuntime() {
        return forceRootRuntime;
    }

    public void setForceRootRuntime(Boolean forceRootRuntime) {
        this.forceRootRuntime = forceRootRuntime;
    }

    public Boolean getNotEnableVirtualKeyboard() {
        return notEnableVirtualKeyboard;
    }

    public void setNotEnableVirtualKeyboard(Boolean notEnableVirtualKeyboard) {
        this.notEnableVirtualKeyboard = notEnableVirtualKeyboard;
    }

    public Boolean getDoEnableOTG() {
        return doEnableOTG;
    }

    public void setDoEnableOTG(Boolean doEnableOTG) {
        this.doEnableOTG = doEnableOTG;
    }
}