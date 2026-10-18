package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:dy.class */
public final class dy {
    public static dy a = new dy();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final ap f259a;
    private final ap b;
    private final ap c;
    private final ap d;
    private final ap e;
    private final ap f;
    private final ap g;
    private final ap h;
    private final ap i;
    private final ap j;
    private final ap k;
    private final ap l;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final ea f260a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private final ea f261b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final fw[] f262a;
    private final ap m;
    private final ap n;
    private final ap o;
    private final ap p;
    private final ap q;
    private final ap r;
    private final ap s;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    private final fw[] f263b;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private final fw[] f264c;

    public dy() {
        new ge();
        new gh();
        new gf();
        this.f259a = new ap();
        this.b = new ap();
        this.c = new ap();
        this.d = new ap();
        this.e = new ap();
        this.f = new ap();
        this.g = new ap();
        this.h = new ap();
        this.i = new ap();
        this.j = new ap();
        this.k = new ap();
        this.l = new ap();
        this.f260a = new ea();
        this.f261b = new ea();
        this.f262a = new fw[2];
        this.m = new ap();
        this.n = new ap();
        this.o = new ap();
        this.p = new ap();
        this.q = new ap();
        this.r = new ap();
        this.s = new ap();
        this.f263b = new fw[2];
        this.f264c = new fw[2];
        this.f262a[0] = new fw();
        this.f262a[1] = new fw();
        this.f263b[0] = new fw();
        this.f263b[1] = new fw();
        this.f264c[0] = new fw();
        this.f264c[1] = new fw();
    }

    private static int a(fw[] fwVarArr, fw[] fwVarArr2, ap apVar, float f) {
        int r8 = 0;
        float fM31a = ap.m31a(apVar, fwVarArr2[0].a) - f;
        float fM31a2 = ap.m31a(apVar, fwVarArr2[1].a) - f;
        if (fM31a <= 0.0f) {
            r8 = 0 + 1;
            fwVarArr[0].a(fwVarArr2[0]);
        }
        if (fM31a2 <= 0.0f) {
            int r1 = r8;
            r8++;
            fwVarArr[r1].a(fwVarArr2[1]);
        }
        if (fM31a * fM31a2 < 0.0f) {
            fwVarArr[r8].a.m22a(fwVarArr2[1].a).m25c(fwVarArr2[0].a).b(fM31a / (fM31a - fM31a2)).m24b(fwVarArr2[0].a);
            if (fM31a > 0.0f) {
                fwVarArr[r8].f397a.a(fwVarArr2[0].f397a);
            } else {
                fwVarArr[r8].f397a.a(fwVarArr2[1].f397a);
            }
            r8++;
        }
        return r8;
    }

    public final void a(eb ebVar, el elVar, es esVar, el elVar2, es esVar2) {
        ebVar.f276b = 0;
        es.a(esVar, elVar.a, this.b);
        es.a(esVar2, elVar2.a, this.c);
        this.f259a.m22a(this.c).m25c(this.b);
        float fM31a = ap.m31a(this.f259a, this.f259a);
        float f = ((eo) elVar).a + ((eo) elVar2).a;
        if (fM31a > f * f) {
            return;
        }
        ebVar.f275a = 0;
        ebVar.b.a(elVar.a);
        ebVar.f274a.m21a();
        ebVar.f276b = 1;
        ebVar.f273a[0].a.a(elVar2.a);
        ebVar.f273a[0].f399a.a();
    }

    public final void a(eb ebVar, en enVar, es esVar, el elVar, es esVar2) {
        ebVar.f276b = 0;
        es.a(esVar2, elVar.a, this.d);
        es.b(esVar, this.d, this.e);
        int r8 = 0;
        float f = Float.MIN_VALUE;
        float f2 = ((eo) enVar).a + ((eo) elVar).a;
        int r0 = enVar.f323a;
        ap[] apVarArr = enVar.f322a;
        ap[] apVarArr2 = enVar.b;
        for (int r14 = 0; r14 < r0; r14++) {
            this.f.b(this.e, apVarArr[r14]);
            float fM31a = ap.m31a(apVarArr2[r14], this.f);
            if (fM31a > f2) {
                return;
            }
            if (fM31a > f) {
                f = fM31a;
                r8 = r14;
            }
        }
        int r1 = r8;
        int r15 = r1 + 1 < r0 ? r1 + 1 : 0;
        ap apVar = apVarArr[r1];
        ap apVar2 = apVarArr[r15];
        if (f < 1.1920929E-7f) {
            ebVar.f276b = 1;
            ebVar.f275a = 1;
            ebVar.f274a.a(apVarArr2[r8]);
            ebVar.b.m22a(apVar).m24b(apVar2).m26a(0.5f);
            ebVar.f273a[0].a.a(elVar.a);
            ebVar.f273a[0].f399a.a();
            return;
        }
        this.f.b(this.e, apVar);
        this.g.b(apVar2, apVar);
        float fM31a2 = ap.m31a(this.f, this.g);
        this.f.b(this.e, apVar2);
        this.g.b(apVar, apVar2);
        float fM31a3 = ap.m31a(this.f, this.g);
        if (fM31a2 <= 0.0f) {
            if (ep.a(this.e, apVar) > f2 * f2) {
                return;
            }
            ebVar.f276b = 1;
            ebVar.f275a = 1;
            ebVar.f274a.b(this.e, apVar);
            ebVar.f274a.m27a();
            ebVar.b.a(apVar);
            ebVar.f273a[0].a.a(elVar.a);
            ebVar.f273a[0].f399a.a();
            return;
        }
        if (fM31a3 <= 0.0f) {
            if (ep.a(this.e, apVar2) > f2 * f2) {
                return;
            }
            ebVar.f276b = 1;
            ebVar.f275a = 1;
            ebVar.f274a.b(this.e, apVar2);
            ebVar.f274a.m27a();
            ebVar.b.a(apVar2);
            ebVar.f273a[0].a.a(elVar.a);
            ebVar.f273a[0].f399a.a();
            return;
        }
        this.f.m22a(apVar).m24b(apVar2).m26a(0.5f);
        this.g.b(this.e, this.f);
        if (ap.m31a(this.g, apVarArr2[r1]) > f2) {
            return;
        }
        ebVar.f276b = 1;
        ebVar.f275a = 1;
        ebVar.f274a.a(apVarArr2[r1]);
        ebVar.b.a(this.f);
        ebVar.f273a[0].a.a(elVar.a);
        ebVar.f273a[0].f399a.a();
    }

    private float a(en enVar, es esVar, int r7, en enVar2, es esVar2) {
        int r0 = enVar.f323a;
        ap[] apVarArr = enVar.f322a;
        ap[] apVarArr2 = enVar.b;
        int r1 = enVar2.f323a;
        ap[] apVarArr3 = enVar2.f322a;
        al.a(esVar.f327a, apVarArr2[r7], this.h);
        al.b(esVar2.f327a, this.h, this.i);
        int r5 = 0;
        float f = Float.MAX_VALUE;
        for (int r13 = 0; r13 < r1; r13++) {
            float fM31a = ap.m31a(apVarArr3[r13], this.i);
            if (fM31a < f) {
                f = fM31a;
                r5 = r13;
            }
        }
        es.a(esVar, apVarArr[r7], this.j);
        es.a(esVar2, apVarArr3[r5], this.k);
        this.k.c(this.j);
        return ap.m31a(this.k, this.h);
    }

    private void a(ea eaVar, en enVar, es esVar, en enVar2, es esVar2) {
        byte b;
        int r0 = enVar.f323a;
        ap[] apVarArr = enVar.b;
        es.a(esVar2, enVar2.a, this.f259a);
        es.a(esVar, enVar.a, this.f);
        this.f259a.m25c(this.f);
        al.b(esVar.f327a, this.f259a, this.l);
        int r15 = 0;
        float f = Float.MIN_VALUE;
        for (int r18 = 0; r18 < r0; r18++) {
            float fM31a = ap.m31a(apVarArr[r18], this.l);
            if (fM31a > f) {
                f = fM31a;
                r15 = r18;
            }
        }
        float fA = a(enVar, esVar, r15, enVar2, esVar2);
        int r14 = r15 - 1 >= 0 ? r15 - 1 : r0 - 1;
        float fA2 = a(enVar, esVar, r14, enVar2, esVar2);
        int r17 = r15 + 1 < r0 ? r15 + 1 : 0;
        float fA3 = a(enVar, esVar, r17, enVar2, esVar2);
        if (fA2 > fA && fA2 > fA3) {
            b = -1;
        } else if (fA3 <= fA) {
            eaVar.f272a = r15;
            eaVar.a = fA;
            return;
        } else {
            b = 1;
            r14 = r17;
            fA2 = fA3;
        }
        while (true) {
            int r16 = b == -1 ? r14 - 1 >= 0 ? r14 - 1 : r0 - 1 : r14 + 1 < r0 ? r14 + 1 : 0;
            float fA4 = a(enVar, esVar, r16, enVar2, esVar2);
            if (fA4 <= fA2) {
                eaVar.f272a = r14;
                eaVar.a = fA2;
                return;
            } else {
                r14 = r16;
                fA2 = fA4;
            }
        }
    }

    public final void a(eb ebVar, en enVar, es esVar, en enVar2, es esVar2) {
        en enVar3;
        es esVar3;
        int r13;
        int r16;
        ebVar.f276b = 0;
        float f = ((eo) enVar).a + ((eo) enVar2).a;
        a(this.f260a, enVar, esVar, enVar2, esVar2);
        if (this.f260a.a > f) {
            return;
        }
        a(this.f261b, enVar2, esVar2, enVar, esVar);
        if (this.f261b.a > f) {
            return;
        }
        if (this.f261b.a > (0.98f * this.f260a.a) + 0.001f) {
            enVar3 = enVar2;
            esVar3 = esVar2;
            r13 = this.f261b.f272a;
            ebVar.f275a = 2;
            r16 = 1;
        } else {
            enVar3 = enVar;
            enVar = enVar2;
            esVar3 = esVar;
            esVar = esVar2;
            r13 = this.f260a.f272a;
            ebVar.f275a = 1;
            r16 = 0;
        }
        fw[] fwVarArr = this.f262a;
        en enVar4 = enVar3;
        int r4 = r13;
        en enVar5 = enVar;
        es esVar4 = esVar;
        int r0 = enVar4.f323a;
        ap[] apVarArr = enVar4.b;
        int r1 = enVar5.f323a;
        ap[] apVarArr2 = enVar5.f322a;
        ap[] apVarArr3 = enVar5.b;
        al.a(esVar3.f327a, apVarArr[r4], this.i);
        al.b(esVar4.f327a, this.i, this.i);
        int r18 = 0;
        float f2 = Float.MAX_VALUE;
        for (int r25 = 0; r25 < r1; r25++) {
            float fM31a = ap.m31a(this.i, apVarArr3[r25]);
            if (fM31a < f2) {
                f2 = fM31a;
                r18 = r25;
            }
        }
        int r2 = r18;
        int r26 = r2 + 1 < r1 ? r2 + 1 : 0;
        es.a(esVar4, apVarArr2[r2], fwVarArr[0].a);
        fwVarArr[0].f397a.a.a = r4;
        fwVarArr[0].f397a.a.b = r2;
        fwVarArr[0].f397a.a.c = 0;
        es.a(esVar4, apVarArr2[r26], fwVarArr[1].a);
        fwVarArr[1].f397a.a.a = r4;
        fwVarArr[1].f397a.a.b = r26;
        fwVarArr[1].f397a.a.c = 1;
        int r3 = enVar3.f323a;
        ap[] apVarArr4 = enVar3.f322a;
        this.r.a(apVarArr4[r13]);
        this.s.a(r13 + 1 < r3 ? apVarArr4[r13 + 1] : apVarArr4[0]);
        this.m.m22a(this.s).m25c(this.r);
        this.m.m27a();
        this.n.b(this.m, 1.0f);
        this.o.m22a(this.r).m24b(this.s).b(0.5f);
        al.a(esVar3.f327a, this.m, this.p);
        this.q.b(this.p, 1.0f);
        es.a(esVar3, this.r, this.r);
        es.a(esVar3, this.s, this.s);
        float fM31a2 = ap.m31a(this.q, this.r);
        float f3 = (-ap.m31a(this.p, this.r)) + f;
        float fM31a3 = ap.m31a(this.p, this.s) + f;
        this.p.m23b();
        int r5 = a(this.f263b, this.f262a, this.p, f3);
        this.p.m23b();
        if (r5 >= 2 && a(this.f264c, this.f263b, this.p, fM31a3) >= 2) {
            ebVar.f274a.a(this.n);
            ebVar.b.a(this.o);
            int r12 = 0;
            for (int r14 = 0; r14 < 2; r14++) {
                if (ap.m31a(this.q, this.f264c[r14].a) - fM31a2 <= f) {
                    fz fzVar = ebVar.f273a[r12];
                    es.b(esVar, this.f264c[r14].a, fzVar.a);
                    fzVar.f399a.a(this.f264c[r14].f397a);
                    fzVar.f399a.a.d = r16;
                    r12++;
                }
            }
            ebVar.f276b = r12;
        }
    }
}
