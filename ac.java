package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:ac.class */
public final class ac {
    public static int a;
    public static int b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public cf f5a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public h f6a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public c f7a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private b f8a;
    public int c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public String f9a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f10a;

    public ac() {
    }

    public static int a(int r4) {
        if (r4 == 0) {
            return -1;
        }
        int r5 = -65536;
        int r6 = 0;
        int r0 = 16;
        while (true) {
            int r7 = r0;
            if (r7 <= 0) {
                return r6;
            }
            if ((r4 & r5) == 0) {
                r5 >>= r7 / 2;
            } else {
                r5 <<= r7 / 2;
                r6 |= r7;
            }
            r0 = r7 >> 1;
        }
    }

    public ac(cf cfVar, c cVar, h hVar) {
        this.f8a = new b();
        new z();
        this.f5a = cfVar;
        this.f7a = cVar;
        this.f6a = hVar;
        b bVar = this.f8a;
        b bVar2 = this.f8a;
        b bVar3 = this.f8a;
        new ab(9092981);
        b bVar4 = this.f8a;
        new ab(10937996);
        b bVar5 = this.f8a;
        a = au.c();
        b = au.m41b();
        this.c = au.m45a(a, b);
        this.f9a = (String) az.a("buy_full_version");
        az.a("more_games_url");
        String str = (String) az.a("more_games_status");
        if (str != null) {
            str.compareTo("on");
        }
        az.a("cheats");
        String str2 = (String) az.a("debug_memory_watch");
        this.f10a = str2 != null && str2.compareTo("on") == 0;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final void m2a(int r4) {
        c cVar = this.f7a;
        cVar.b.a(268435456);
        cVar.c.a(r4);
    }

    public final void b(int r4) {
        c cVar = this.f7a;
        cVar.b.a(805306368);
        cVar.c.a(r4);
    }

    public final void a() {
        c cVar = this.f7a;
        cVar.b.a(536870913);
        cVar.c.a(0);
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final cb m3a() {
        return (cb) this.f5a.m33a();
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final cb m4a(int r4) {
        return (cb) this.f5a.a(r4);
    }

    public final void c(int r4) {
        this.f6a.a(r4);
    }
}
