package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:di.class */
public final class di {
    private static int a = -1;
    private static int b = 0;
    private static int c = 0;

    public static void a() {
    }

    public static void b() {
        if (ce.a) {
            a(0);
        }
    }

    public static void c() {
        if (ce.a) {
            a(4);
        }
    }

    public static void d() {
        if (a != -1) {
            ay.c(a);
            ay.a(a);
        }
        a = -1;
        b = 0;
    }

    private static void a(int r3) {
        if (!ce.a || b == r3) {
            return;
        }
        b = r3;
        if (r3 <= 0 || r3 >= 34) {
            d();
            return;
        }
        if (a == -1) {
            a = ay.a();
        }
        ay.a(a, b);
        ay.d(a);
        ay.b(a);
    }

    public static void e() {
        if (!ce.a || c == 0) {
            return;
        }
        a(c);
        c = 0;
    }

    public static void f() {
        c = b;
        d();
    }
}
