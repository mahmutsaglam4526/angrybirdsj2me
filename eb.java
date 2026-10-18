package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:eb.class */
public final class eb {
    private static final w a = new w();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final fz[] f273a = new fz[2];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final ap f274a;
    public final ap b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public int f275a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public int f276b;

    public static eb a() {
        eb ebVar = (eb) a.a();
        eb ebVar2 = ebVar;
        if (ebVar == null) {
            ebVar2 = new eb();
            a.a(ebVar2);
        }
        return ebVar2;
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public static void m160a() {
        a.a(1);
    }

    public eb() {
        for (int r6 = 0; r6 < 2; r6++) {
            this.f273a[r6] = new fz();
        }
        this.f274a = new ap();
        this.b = new ap();
        this.f276b = 0;
    }

    public final void a(eb ebVar) {
        for (int r6 = 0; r6 < ebVar.f276b; r6++) {
            fz fzVar = this.f273a[r6];
            fz fzVar2 = ebVar.f273a[r6];
            fzVar.a.m22a(fzVar2.a);
            fzVar.f398a = fzVar2.f398a;
            fzVar.b = fzVar2.b;
            fzVar.f399a.a(fzVar2.f399a);
        }
        this.f275a = ebVar.f275a;
        this.f274a.m22a(ebVar.f274a);
        this.b.m22a(ebVar.b);
        this.f276b = ebVar.f276b;
    }
}
