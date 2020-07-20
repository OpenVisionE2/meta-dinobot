EXTRA_OECONF_append_pn-enigma2 = "--with-lcddev=/dev/null --with-alphablendingacceleration=always"

SOC_FAMILY = "hisi3798cv200"

require conf/machine/include/dinobot-cortexa15.inc
require conf/machine/include/dinobot-emmc.inc

PREFERRED_PROVIDER_virtual/blindscan-dvbs = "dinobot-blindscan-u533"

MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "\
	dinobot-dvb-modules-u533 \
	dinobot-libs-u533 \
	dinobot-hihalt-u533 \
	"

PREFERRED_RPROVIDER_showiframe = "dinobot-showiframe-u533"
PREFERRED_RPROVIDER_aio-grab = "dinobot-grab-u533"

MACHINETYPE = "u533"

MTD_KERNEL = "mmcblk0p10"
MTD_ROOTFS = "mmcblk0p13"

SDCARDIMG = "no"

MACHINE_FEATURES += "7segment hiaccel"

IMAGEDIR = "e2/update"

STB_PLATFORM = "u533"
