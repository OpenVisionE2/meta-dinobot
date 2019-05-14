# We know about rtc
include conf/machine/include/build-extras.inc

BOX_BRAND = "dinobot"

KERNEL_MODULE_AUTOLOAD += "xhci-plat-hcd"
KERNEL_MODULE_AUTOLOAD += "ehci-platform"
KERNEL_MODULE_AUTOLOAD += "ohci-platform"
KERNEL_MODULE_AUTOLOAD += "cfg80211"

MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "\
    kernel-module-xhci-plat-hcd \
    kernel-module-ehci-platform \
    kernel-module-ohci-platform \
    dinobot-pvr \
    dinobot-lib-helper \
    rtl8192eu \
    firmware-rtl8192eu \
    rtl8822bu \
    rt8188fu \
"

MACHINE_FEATURES += "videoenhancement switchoff hdmicec textlcd blindscan-tbs emmc mmc alsa multitranscoding hiaccel"

PREFERRED_PROVIDER_virtual/kernel = "linux-dinobot"
PREFERRED_VERSION_linux-dinobot = "4.4.35"
PREFERRED_VERSION_directfb = "1.7.7"

MACHINE_EXTRA_RRECOMMENDS += "\
    gstreamer1.0-plugin-dvbmediasink \
    gstreamer1.0-libav \
    "

DVBPROVIDER = "kernel"
DVBSKYPROVIDER = "kernel"

include conf/machine/include/autoload-filesystems.inc
require conf/machine/include/soc-family.inc

DVBMEDIASINK_CONFIG = "--with-h265 --with-vb8 --with-vb9 --with-spark --with-opus --with-wma --with-wmv --with-pcm --with-dts --with-eac3"

PREFERRED_PROVIDER_virtual/enigma2-mediaservice ?= "enigma2-plugin-systemplugins-servicehisilicon"
