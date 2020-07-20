EXTRA_OECONF_append_pn-enigma2 = "--with-lcddev=/dev/null --with-alphablendingacceleration=always"

SOC_FAMILY = "hisi3798mv200"

KERNEL_MODULE_AUTOLOAD += "rt8188fu"

require conf/machine/include/dinobot-cortexa15.inc
require conf/machine/include/dinobot-ubi.inc

PREFERRED_PROVIDER_virtual/blindscan-dvbs = "dinobot-blindscan-u55"

MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "\
	dinobot-dvb-modules-u55 \
	dinobot-libs-u55 \
	dinobot-hihalt-u55 \
	"

PREFERRED_RPROVIDER_showiframe = "dinobot-showiframe-u55"
PREFERRED_RPROVIDER_aio-grab = "dinobot-grab-u55"

MACHINETYPE = "u55"

MTD_KERNEL = "mtd10"
MTD_ROOTFS = "mtd11"

SDCARDIMG = "no"

MACHINE_FEATURES += "7segment blindscan-dvbs textlcd hiaccel RCA"
