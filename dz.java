package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:dz.class */
public final class dz {
    private static int a = 0;
    private static int b = 0;
    private static int c = 20;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public static dz f265a = new dz();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ed f266a = new ed();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int[] f267a = new int[3];

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private int[] f268b = new int[3];

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ap f269a = new ap();

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private ap f270b = new ap();

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private ap f271c = new ap();

    public dz() {
        new ap();
    }

    /* JADX WARN: Code duplicated, block: B:105:0x06fd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:95:0x06ed A[LOOP:1: B:19:0x0189->B:95:0x06ed, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:99:0x0750 A[LOOP:4: B:97:0x0746->B:99:0x0750, LOOP_END] */
    public final void a(gf gfVar, gh ghVar, ge geVar) {
        ed edVar;
        int r19;
        a++;
        gg ggVar = geVar.a;
        gg ggVar2 = geVar.b;
        es esVar = geVar.f408a;
        es esVar2 = geVar.f409b;
        ed edVar2 = this.f266a;
        edVar2.f285a = ghVar.f413a;
        for (int r23 = 0; r23 < edVar2.f285a; r23++) {
            ee eeVar = edVar2.f284a[r23];
            eeVar.f290a = ghVar.f414a[r23];
            eeVar.f291b = ghVar.b[r23];
            ap apVar = ggVar.a[eeVar.f290a];
            ap apVar2 = ggVar2.a[eeVar.f291b];
            es.a(esVar, apVar, eeVar.a);
            es.a(esVar2, apVar2, eeVar.b);
            eeVar.c.m22a(eeVar.b).m25c(eeVar.a);
            eeVar.f289a = 0.0f;
        }
        if (edVar2.f285a > 1) {
            float f = ghVar.a;
            float fA = edVar2.a();
            if (fA < 0.5f * f || f * 2.0f < fA || fA < 1.1920929E-7f) {
                edVar2.f285a = 0;
            }
        }
        if (edVar2.f285a == 0) {
            ee eeVar2 = edVar2.f284a[0];
            eeVar2.f290a = 0;
            eeVar2.f291b = 0;
            ap apVar3 = ggVar.a[0];
            ap apVar4 = ggVar2.a[0];
            es.a(esVar, apVar3, eeVar2.a);
            es.a(esVar2, apVar4, eeVar2.b);
            eeVar2.c.m22a(eeVar2.b).m25c(eeVar2.a);
            edVar2.f285a = 1;
        }
        ee[] eeVarArr = this.f266a.f284a;
        this.f266a.a(this.f269a);
        this.f269a.m28b();
        int r16 = 0;
        while (r16 < c) {
            int r0 = this.f266a.f285a;
            for (int r17 = 0; r17 < r0; r17++) {
                this.f267a[r17] = eeVarArr[r17].f290a;
                this.f268b[r17] = eeVarArr[r17].f291b;
            }
            switch (this.f266a.f285a) {
                case 2:
                    ed edVar3 = this.f266a;
                    ap apVar5 = edVar3.a.c;
                    ap apVar6 = edVar3.b.c;
                    edVar3.f286a.m22a(apVar6).m25c(apVar5);
                    float f2 = -ap.m31a(apVar5, edVar3.f286a);
                    if (f2 <= 0.0f) {
                        edVar3.a.f289a = 1.0f;
                        edVar3.f285a = 1;
                    } else {
                        float fM31a = ap.m31a(apVar6, edVar3.f286a);
                        if (fM31a <= 0.0f) {
                            edVar3.b.f289a = 1.0f;
                            edVar3.f285a = 1;
                            edVar3.a.a(edVar3.b);
                        } else {
                            float f3 = 1.0f / (fM31a + f2);
                            edVar3.a.f289a = fM31a * f3;
                            edVar3.b.f289a = f2 * f3;
                            edVar3.f285a = 2;
                        }
                    }
                    break;
                case 3:
                    ed edVar4 = this.f266a;
                    edVar4.d.m22a(edVar4.a.c);
                    edVar4.e.m22a(edVar4.b.c);
                    edVar4.f.m22a(edVar4.c.c);
                    edVar4.f286a.m22a(edVar4.e).m25c(edVar4.d);
                    float fM31a2 = ap.m31a(edVar4.d, edVar4.f286a);
                    float fM31a3 = ap.m31a(edVar4.e, edVar4.f286a);
                    float f4 = -fM31a2;
                    edVar4.f287b.m22a(edVar4.f).m25c(edVar4.d);
                    float fM31a4 = ap.m31a(edVar4.d, edVar4.f287b);
                    float fM31a5 = ap.m31a(edVar4.f, edVar4.f287b);
                    float f5 = -fM31a4;
                    edVar4.f288c.m22a(edVar4.f).m25c(edVar4.e);
                    float fM31a6 = ap.m31a(edVar4.e, edVar4.f288c);
                    float fM31a7 = ap.m31a(edVar4.f, edVar4.f288c);
                    float f6 = -fM31a6;
                    float fM32b = ap.m32b(edVar4.f286a, edVar4.f287b);
                    float fM32b2 = fM32b * ap.m32b(edVar4.e, edVar4.f);
                    float fM32b3 = fM32b * ap.m32b(edVar4.f, edVar4.d);
                    float fM32b4 = fM32b * ap.m32b(edVar4.d, edVar4.e);
                    if (f4 <= 0.0f && f5 <= 0.0f) {
                        edVar4.a.f289a = 1.0f;
                        edVar4.f285a = 1;
                    } else if (fM31a3 > 0.0f && f4 > 0.0f && fM32b4 <= 0.0f) {
                        float f7 = 1.0f / (fM31a3 + f4);
                        edVar4.a.f289a = fM31a3 * f7;
                        edVar4.b.f289a = f4 * f7;
                        edVar4.f285a = 2;
                    } else if (fM31a5 > 0.0f && f5 > 0.0f && fM32b3 <= 0.0f) {
                        float f8 = 1.0f / (fM31a5 + f5);
                        edVar4.a.f289a = fM31a5 * f8;
                        edVar4.c.f289a = f5 * f8;
                        edVar4.f285a = 2;
                        edVar4.b.a(edVar4.c);
                    } else if (fM31a3 <= 0.0f && f6 <= 0.0f) {
                        edVar4.b.f289a = 1.0f;
                        edVar4.f285a = 1;
                        edVar4.a.a(edVar4.b);
                    } else if (fM31a5 <= 0.0f && fM31a7 <= 0.0f) {
                        edVar4.c.f289a = 1.0f;
                        edVar4.f285a = 1;
                        edVar4.a.a(edVar4.c);
                    } else if (fM31a7 <= 0.0f || f6 <= 0.0f || fM32b2 > 0.0f) {
                        float f9 = 1.0f / ((fM32b2 + fM32b3) + fM32b4);
                        edVar4.a.f289a = fM32b2 * f9;
                        edVar4.b.f289a = fM32b3 * f9;
                        edVar4.c.f289a = fM32b4 * f9;
                        edVar4.f285a = 3;
                    } else {
                        float f10 = 1.0f / (fM31a7 + f6);
                        edVar4.b.f289a = fM31a7 * f10;
                        edVar4.c.f289a = f6 * f10;
                        edVar4.f285a = 2;
                        edVar4.a.a(edVar4.c);
                    }
                    break;
            }
            if (this.f266a.f285a != 3) {
                this.f266a.a(this.f269a);
                this.f269a.m28b();
                ed edVar5 = this.f266a;
                ap apVar7 = this.f270b;
                switch (edVar5.f285a) {
                    case 1:
                        apVar7.m22a(edVar5.a.c).m23b();
                        break;
                    case 2:
                        edVar5.f286a.m22a(edVar5.b.c).m25c(edVar5.a.c);
                        apVar7.m22a(edVar5.a.c).m23b();
                        if (ap.m32b(edVar5.f286a, apVar7) > 0.0f) {
                            apVar7.a(1.0f, edVar5.f286a);
                        } else {
                            apVar7.b(edVar5.f286a, 1.0f);
                        }
                        break;
                    default:
                        apVar7.m21a();
                        break;
                }
                if (this.f270b.m28b() >= 1.4210855E-14f) {
                    ee eeVar3 = eeVarArr[this.f266a.f285a];
                    al.b(esVar.f327a, this.f270b.m23b(), this.f271c);
                    eeVar3.f290a = ggVar.a(this.f271c);
                    es.a(esVar, ggVar.a[eeVar3.f290a], eeVar3.a);
                    al.b(esVar2.f327a, this.f270b.m23b(), this.f271c);
                    eeVar3.f291b = ggVar2.a(this.f271c);
                    es.a(esVar2, ggVar2.a[eeVar3.f291b], eeVar3.b);
                    eeVar3.c.m22a(eeVar3.b).m25c(eeVar3.a);
                    r16++;
                    b++;
                    boolean z = false;
                    for (int r110 = 0; r110 < r0; r110++) {
                        if (eeVar3.f290a == this.f267a[r110] && eeVar3.f291b == this.f268b[r110]) {
                            z = true;
                            if (!z) {
                                this.f266a.f285a++;
                            }
                        }
                    }
                    if (!z) {
                        this.f266a.f285a++;
                    }
                }
            }
            c = q.c(c, r16);
            this.f266a.a(gfVar.a, gfVar.b);
            gfVar.f410a = ep.b(gfVar.a, gfVar.b);
            edVar = this.f266a;
            ghVar.a = edVar.a();
            ghVar.f413a = edVar.f285a;
            for (r19 = 0; r19 < edVar.f285a; r19++) {
                ghVar.f414a[r19] = edVar.f284a[r19].f290a;
                ghVar.b[r19] = edVar.f284a[r19].f291b;
            }
        }
        c = q.c(c, r16);
        this.f266a.a(gfVar.a, gfVar.b);
        gfVar.f410a = ep.b(gfVar.a, gfVar.b);
        edVar = this.f266a;
        ghVar.a = edVar.a();
        ghVar.f413a = edVar.f285a;
        while (r19 < edVar.f285a) {
            ghVar.f414a[r19] = edVar.f284a[r19].f290a;
            ghVar.b[r19] = edVar.f284a[r19].f291b;
        }
    }
}
