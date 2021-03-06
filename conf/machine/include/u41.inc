EXTRA_OECONF_append_pn-enigma2 = "--with-lcddev=/dev/null --with-alphablendingacceleration=always"

SOC_FAMILY = "hisi3716mv410"
HICHIPSET = "3716mv410"
CHIPSET = "Hi3716Mv410"

KERNEL_MODULE_AUTOLOAD += "8192eu"

require conf/machine/include/dinobot-cortexa9.inc
require conf/machine/include/dinobot-ubi.inc

MACHINE_ESSENTIAL_EXTRA_RDEPENDS += "\
	dinobot-cpu-scaling \
	"

MACHINETYPE = "u41"

SDCARDIMG = "no"

MACHINE_FEATURES += "blindscan-dvbs textlcd hiaccel RCA vfdsymbol"

STB_PLATFORM = "${MACHINETYPE}"
