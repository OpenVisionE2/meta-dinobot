EXTRA_OECONF_append_pn-enigma2 = "--with-lcddev=/dev/null --with-alphablendingacceleration=always"

SOC_FAMILY = "hisi3798cv200"

KERNEL_MODULE_AUTOLOAD += "88x2bu"

require conf/machine/include/dinobot-cortexa15.inc
require conf/machine/include/dinobot-emmc.inc

PREFERRED_PROVIDER_virtual/blindscan-dvbs = "dinobot-blindscan-u53"

MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "\
	dinobot-dvb-modules-u53 \
	dinobot-libs-u53 \
	dinobot-hihalt-u53 \
	"

PREFERRED_RPROVIDER_showiframe = "dinobot-showiframe-u53"
PREFERRED_RPROVIDER_aio-grab = "dinobot-grab-u53"

MACHINETYPE = "u53"

MTD_KERNEL = "mmcblk0p10"
MTD_ROOTFS = "mmcblk0p13"

SDCARDIMG = "no"

MACHINE_FEATURES += "7segment dvb-c blindscan-dvbs textlcd hiaccel"

IMAGEDIR = "dinobot/u53"
