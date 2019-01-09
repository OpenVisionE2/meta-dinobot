# We know about rtc
include conf/machine/include/build-extras.inc

KERNEL_MODULE_AUTOLOAD += "xhci-plat-hcd"
KERNEL_MODULE_AUTOLOAD += "ehci-platform"
KERNEL_MODULE_AUTOLOAD += "ohci-platform"
KERNEL_MODULE_AUTOLOAD += "cfg80211"

MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "\
    kernel-module-xhci-plat-hcd \
    kernel-module-ehci-platform \
    kernel-module-ohci-platform \
    dinobot-lib-helper \
"

MACHINE_FEATURES += "videoenhancement switchoff hdmicec 7segment textlcd blindscan-tbs emmc mmc alsa multitranscoding hiaccel"
#MACHINE_FEATURES += "hbbtv-browser-webkit qtstalker"

TARGET_ARCH = "arm"
DEFAULTTUNE = "cortexa15hf-neon-vfpv4"

PREFERRED_PROVIDER_virtual/kernel = "linux-dinobot"
PREFERRED_VERSION_linux-dinobot = "4.4.35"
PREFERRED_VERSION_directfb = "1.7.7"

require conf/machine/include/tune-cortexa15.inc

MACHINE_EXTRA_RRECOMMENDS += "\
    gstreamer1.0-plugin-dvbmediasink \
    gstreamer1.0-libav \
    "

DVBPROVIDER = "kernel"
DVBSKYPROVIDER = "kernel"

include conf/machine/include/autoload-filesystems.inc
require conf/machine/include/soc-family.inc

DVBMEDIASINK_CONFIG = "--with-h265 --with-vb8 --with-vb9 --with-spark --with-opus --with-wma --with-wmv --with-pcm --with-dts --with-eac3"