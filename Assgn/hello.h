#ifndef _HELLO_H_
#define _HELLO_H_

#include <types.h>
#include <kern/errno.h>
#include <kern/unistd.h>
#include <lib.h>

static char *my_kstrdup(const char *buf);

static int my_toupper(int c);

void complex_hello(void);


#endif /* _HELLO_H_ */
