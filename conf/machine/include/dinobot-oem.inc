# We know about rtc
require conf/machine/include/build-extras.inc

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
    dinobot-libs-${MACHINETYPE} \
    rtl8192eu \
    firmware-rtl8192eu \
    rt8822bu \
    rt8188fu \
    firmware-rt8188fu \
    ${@bb.utils.contains('MACHINE_FEATURES', 'emmc', 'dinobot-resizerootfs' , '', d)} \
    dinobot-partitions-${SOC_FAMILY} \
"

MACHINE_FEATURES += "videoenhancement switchoff hdmicec blindscan-tbs alsa multitranscoding hisil"

PREFERRED_PROVIDER_virtual/kernel = "linux-dinobot"
PREFERRED_VERSION_linux-dinobot = "4.4.35"
PREFERRED_VERSION_directfb = "1.7.7"
PREFERRED_VERSION_ffmpeg = "3.4.2"

MACHINE_EXTRA_RRECOMMENDS += "\
    gstreamer1.0-plugin-dvbmediasink \
    "

DVBPROVIDER = "kernel"
DVBSKYPROVIDER = "kernel"

require conf/machine/include/autoload-filesystems.inc
require conf/machine/include/soc-family.inc

DVBMEDIASINK_CONFIG = "--with-h265 --with-vb8 --with-vb9 --with-spark --with-wma --with-wmv --with-pcm --with-dts --with-eac3"

PREFERRED_PROVIDER_virtual/enigma2-mediaservice ?= "enigma2-plugin-systemplugins-servicehisilicon"

DEPENDS_append_pn-enigma2 = " dinobot-libs-${MACHINETYPE} "
