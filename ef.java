package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:ef.class */
public final class ef {
    private static int a = 0;
    private static int b = 0;
    private static int c = 0;
    private static int d = 0;
    private static int e = 0;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static ef f292a = new ef();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final gh f293a = new gh();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final ge f294a = new ge();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final es f295a = new es();

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private final es f296b = new es();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final gf f297a = new gf();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final ec f298a = new ec();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final int[] f299a = new int[2];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final er f300a = new er();

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private final er f301b = new er();

    /* JADX WARN: Code duplicated, block: B:58:0x07a6  */
    /* JADX WARN: Code duplicated, block: B:66:0x07bf A[SYNTHETIC] */
    public final void a(gd gdVar, gc gcVar) {
        float fM31a;
        a++;
        gdVar.a = 0;
        gdVar.f407a = gcVar.f406a;
        gg ggVar = gcVar.a;
        gg ggVar2 = gcVar.b;
        this.f300a.a(gcVar.f404a);
        this.f301b.a(gcVar.f405b);
        this.f300a.a();
        this.f301b.a();
        float f = gcVar.f406a;
        float fMax = Math.max(eq.a, (ggVar.f412a + ggVar2.f412a) - (3.0f * eq.a));
        float f2 = 0.25f * eq.a;
        float f3 = 0.0f;
        int r17 = 0;
        this.f293a.f413a = 0;
        this.f294a.a = gcVar.a;
        this.f294a.b = gcVar.b;
        ge geVar = this.f294a;
        do {
            this.f300a.a(this.f295a, f3);
            this.f301b.a(this.f296b, f3);
            this.f294a.f408a = this.f295a;
            this.f294a.f409b = this.f296b;
            dz.f265a.a(this.f297a, this.f293a, this.f294a);
            if (this.f297a.f410a <= 0.0f) {
                gdVar.a = 2;
                gdVar.f407a = 0.0f;
            } else if (this.f297a.f410a < fMax + f2) {
                gdVar.a = 3;
                gdVar.f407a = f3;
            } else {
                ec ecVar = this.f298a;
                gh ghVar = this.f293a;
                er erVar = this.f300a;
                er erVar2 = this.f301b;
                float f4 = f3;
                ecVar.a = ggVar;
                ecVar.b = ggVar2;
                int r0 = ghVar.f413a;
                ecVar.f280a = erVar;
                ecVar.f281b = erVar2;
                ecVar.f280a.a(ecVar.f282a, f4);
                ecVar.f281b.a(ecVar.f283b, f4);
                if (r0 == 1) {
                    ecVar.f277a = 0;
                    ecVar.c.a(ecVar.a.a[ghVar.f414a[0]]);
                    ecVar.d.a(ecVar.b.a[ghVar.b[0]]);
                    es.a(ecVar.f282a, ecVar.c, ecVar.e);
                    es.a(ecVar.f283b, ecVar.d, ecVar.f);
                    ecVar.f279b.b(ecVar.f, ecVar.e);
                    ecVar.f279b.m27a();
                } else if (ghVar.f414a[0] == ghVar.f414a[1]) {
                    ecVar.f277a = 2;
                    ecVar.j.a(ecVar.b.a[ghVar.b[0]]);
                    ecVar.k.a(ecVar.b.a[ghVar.b[1]]);
                    ecVar.l.b(ecVar.k, ecVar.j);
                    ecVar.f279b.b(ecVar.l, 1.0f);
                    ecVar.f279b.m27a();
                    al.a(ecVar.f283b.f327a, ecVar.f279b, ecVar.i);
                    ecVar.f278a.m22a(ecVar.j).m24b(ecVar.k).b(0.5f);
                    es.a(ecVar.f283b, ecVar.f278a, ecVar.f);
                    ecVar.c.a(ggVar.a[ghVar.f414a[0]]);
                    es.a(ecVar.f282a, ecVar.c, ecVar.e);
                    ecVar.l.b(ecVar.e, ecVar.f);
                    if (ap.m31a(ecVar.l, ecVar.i) < 0.0f) {
                        ecVar.f279b.m23b();
                    }
                } else {
                    ecVar.f277a = 1;
                    ecVar.g.a(ecVar.a.a[ghVar.f414a[0]]);
                    ecVar.h.a(ecVar.a.a[ghVar.f414a[1]]);
                    ecVar.l.b(ecVar.h, ecVar.g);
                    ecVar.f279b.b(ecVar.l, 1.0f);
                    ecVar.f279b.m27a();
                    al.a(ecVar.f282a.f327a, ecVar.f279b, ecVar.i);
                    ecVar.f278a.m22a(ecVar.g).m24b(ecVar.h).b(0.5f);
                    es.a(ecVar.f282a, ecVar.f278a, ecVar.e);
                    ecVar.d.a(ecVar.b.a[ghVar.b[0]]);
                    es.a(ecVar.f283b, ecVar.d, ecVar.f);
                    ecVar.l.b(ecVar.f, ecVar.e);
                    if (ap.m31a(ecVar.l, ecVar.i) < 0.0f) {
                        ecVar.f279b.m23b();
                    }
                }
                boolean z = false;
                float f5 = f;
                int r19 = 0;
                do {
                    ec ecVar2 = this.f298a;
                    int[] r1 = this.f299a;
                    float f6 = f5;
                    ecVar2.f280a.a(ecVar2.f282a, f6);
                    ecVar2.f281b.a(ecVar2.f283b, f6);
                    switch (ecVar2.f277a) {
                        case 0:
                            al.b(ecVar2.f282a.f327a, ecVar2.f279b, ecVar2.m);
                            al.b(ecVar2.f283b.f327a, ecVar2.f279b.m23b(), ecVar2.n);
                            ecVar2.f279b.m23b();
                            r1[0] = ecVar2.a.a(ecVar2.m);
                            r1[1] = ecVar2.b.a(ecVar2.n);
                            ecVar2.c.a(ecVar2.a.a[r1[0]]);
                            ecVar2.d.a(ecVar2.b.a[r1[1]]);
                            es.a(ecVar2.f282a, ecVar2.c, ecVar2.e);
                            es.a(ecVar2.f283b, ecVar2.d, ecVar2.f);
                            fM31a = ap.m31a(ecVar2.f.m25c(ecVar2.e), ecVar2.f279b);
                            break;
                        case 1:
                            al.a(ecVar2.f282a.f327a, ecVar2.f279b, ecVar2.i);
                            es.a(ecVar2.f282a, ecVar2.f278a, ecVar2.e);
                            al.b(ecVar2.f283b.f327a, ecVar2.i.m23b(), ecVar2.n);
                            ecVar2.i.b();
                            r1[0] = -1;
                            r1[1] = ecVar2.b.a(ecVar2.n);
                            ecVar2.d.a(ecVar2.b.a[r1[1]]);
                            es.a(ecVar2.f283b, ecVar2.d, ecVar2.f);
                            fM31a = ap.m31a(ecVar2.f.m25c(ecVar2.e), ecVar2.i);
                            break;
                        case 2:
                            al.a(ecVar2.f283b.f327a, ecVar2.f279b, ecVar2.i);
                            es.a(ecVar2.f283b, ecVar2.f278a, ecVar2.f);
                            al.b(ecVar2.f282a.f327a, ecVar2.i.m23b(), ecVar2.m);
                            ecVar2.i.b();
                            r1[1] = -1;
                            r1[0] = ecVar2.a.a(ecVar2.m);
                            ecVar2.c.a(ecVar2.a.a(r1[0]));
                            es.a(ecVar2.f282a, ecVar2.c, ecVar2.e);
                            fM31a = ap.m31a(ecVar2.e.m25c(ecVar2.f), ecVar2.i);
                            break;
                        default:
                            r1[0] = -1;
                            r1[1] = -1;
                            fM31a = 0.0f;
                            break;
                    }
                    float f7 = fM31a;
                    if (fM31a > fMax + f2) {
                        gdVar.a = 4;
                        gdVar.f407a = f;
                        z = true;
                    } else if (f7 > fMax - f2) {
                        f3 = f5;
                    } else {
                        float fA = this.f298a.a(this.f299a[0], this.f299a[1], f3);
                        float f8 = fA;
                        if (fA < fMax - f2) {
                            gdVar.a = 1;
                            gdVar.f407a = f3;
                            z = true;
                        } else if (f8 <= fMax + f2) {
                            gdVar.a = 3;
                            gdVar.f407a = f3;
                            z = true;
                        } else {
                            int r22 = 0;
                            float f9 = f3;
                            float f10 = f5;
                            do {
                                float f11 = (r22 & 1) == 1 ? f9 + (((fMax - f8) * (f10 - f9)) / (f7 - f8)) : 0.5f * (f9 + f10);
                                float fA2 = this.f298a.a(this.f299a[0], this.f299a[1], f11);
                                if (am.a(fA2 - fMax) < f2) {
                                    f5 = f11;
                                } else {
                                    if (fA2 > fMax) {
                                        f9 = f11;
                                        f8 = fA2;
                                    } else {
                                        f10 = f11;
                                        f7 = fA2;
                                    }
                                    r22++;
                                    d++;
                                }
                                e = q.c(e, r22);
                                r19++;
                            } while (r22 != 50);
                            e = q.c(e, r22);
                            r19++;
                        }
                    }
                    r17++;
                    b++;
                    if (!z) {
                    }
                } while (r19 != 8);
                r17++;
                b++;
                if (!z) {
                }
            }
            c = q.c(c, r17);
        } while (r17 != 1000);
        gdVar.a = 1;
        gdVar.f407a = f3;
        c = q.c(c, r17);
    }
}
