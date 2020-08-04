EXTRA_OECONF_append_pn-enigma2 = "--with-lcddev=/dev/null --with-alphablendingacceleration=always"

SOC_FAMILY = "hisi3798mv200"
HICHIPSET = "3798mv200"
CHIPSET = "Hi3798Mv200"

KERNEL_MODULE_AUTOLOAD += "8192eu"

require conf/machine/include/dinobot-cortexa15.inc
require conf/machine/include/dinobot-emmc.inc

PREFERRED_PROVIDER_virtual/blindscan-dvbs = "dinobot-blindscan-u54"

MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "\
	dinobot-dvb-modules-u54 \
	dinobot-libs-u54 \
	dinobot-hihalt-u54 \
	"

PREFERRED_RPROVIDER_showiframe = "dinobot-showiframe-u54"
PREFERRED_RPROVIDER_aio-grab = "dinobot-grab-u54"

MACHINETYPE = "u54"

MTD_KERNEL = "mmcblk0p10"
MTD_ROOTFS = "mmcblk0p13"

SDCARDIMG = "no"

MACHINE_FEATURES += "7segment blindscan-dvbs textlcd hiaccel RCA"

IMAGEDIR = "dinobot/u54"

STB_PLATFORM = "u54"

EXTRA_ALSA = "mv200"
