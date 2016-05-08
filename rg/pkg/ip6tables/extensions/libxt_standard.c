/* Shared library add-on to iptables for standard target support. */
#include <stdio.h>
#define INIT_FUNC libxt_standard_init
#include "xtables.h"

static void standard_help(void)
{
	printf(
"standard match options:\n"
"(If target is DROP, ACCEPT, RETURN or nothing)\n");
}

static struct xtables_target standard_target = {
	.family		= NFPROTO_UNSPEC,
	.name		= "standard",
	.version	= XTABLES_VERSION,
	.size		= XT_ALIGN(sizeof(int)),
	.userspacesize	= XT_ALIGN(sizeof(int)),
	.help		= standard_help,
};

void INIT_FUNC(void)
{
	xtables_register_target(&standard_target);
}
