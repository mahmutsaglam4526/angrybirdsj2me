package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:an.class */
public final class an {
    public int a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public ak f43a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public am f44a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private fq f45a;
    public int b;
    private int c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ap f46a;

    /* JADX INFO: renamed from: c, reason: collision with other field name */
    private boolean f47c;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public float f48a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public boolean f49a;

    /* JADX INFO: renamed from: b, reason: collision with other field name */
    public boolean f50b;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public fi[][] f51a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    public final ez f52a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ex f53a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private am[] f54a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private gc f55a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private gd f56a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private er f57a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private fo f58a;

    public an() {
    }

    public static final int a(int r5, int r6) {
        return (int) ((((long) r5) * ((long) r6)) >> 16);
    }

    public static int a(int r3) {
        return ((r3 + 32768) - (r3 < 0 ? 1 : 0)) >> 16;
    }

    public an(ap apVar) {
        this.f46a = new ap();
        this.f51a = new fi[2][2];
        this.f52a = new ez();
        new es();
        new ap();
        new ap();
        new fb();
        new fc();
        new ga();
        this.f53a = new ex();
        this.f54a = new am[10];
        this.f55a = new gc();
        this.f56a = new gd();
        this.f57a = new er();
        this.f58a = new fo();
        new ap();
        new ap();
        this.f49a = true;
        this.f50b = true;
        this.f47c = true;
        this.f46a.a(apVar);
        this.a = 4;
        this.f48a = 0.0f;
        this.f43a = new ak(this);
        a(new ax(new fs()), 0, 0);
        a(new ax(new fu()), 1, 0);
        a(new ax(new fv()), 1, 1);
    }

    private void a(ax axVar, int r6, int r7) {
        fi fiVar = new fi();
        fiVar.a = axVar;
        fiVar.f379a = true;
        this.f51a[r6][r7] = fiVar;
        if (r6 != r7) {
            fi fiVar2 = new fi();
            fiVar2.a = axVar;
            fiVar2.f379a = false;
            this.f51a[r7][r6] = fiVar2;
        }
    }

    public final void a(am amVar) {
        if (a()) {
            return;
        }
        fr frVar = amVar.f36a;
        while (frVar != null) {
            frVar = frVar.b;
            if (!a()) {
                fq fqVar = null;
                if (fqVar.a != null) {
                    fq fqVar2 = null;
                    fq fqVar3 = null;
                    fqVar2.a.b = fqVar3.b;
                }
                fq fqVar4 = null;
                if (fqVar4.b != null) {
                    fq fqVar5 = null;
                    fq fqVar6 = null;
                    fqVar5.b.a = fqVar6.a;
                }
                if (this.f45a == null) {
                    fq fqVar7 = null;
                    this.f45a = fqVar7.b;
                }
                am amVar2 = null;
                amVar2.a(true);
                am amVar3 = null;
                amVar3.a(true);
                fr frVar2 = null;
                if (frVar2.a != null) {
                    fr frVar3 = null;
                    fr frVar4 = null;
                    frVar3.a.b = frVar4.b;
                }
                fr frVar5 = null;
                if (frVar5.b != null) {
                    fr frVar6 = null;
                    fr frVar7 = null;
                    frVar6.b.a = frVar7.a;
                }
                am amVar4 = null;
                if (null == amVar4.f36a) {
                    am amVar5 = null;
                    fr frVar8 = null;
                    amVar5.f36a = frVar8.b;
                }
                fr frVar9 = null;
                frVar9.a = null;
                fr frVar10 = null;
                frVar10.b = null;
                fr frVar11 = null;
                if (frVar11.a != null) {
                    fr frVar12 = null;
                    fr frVar13 = null;
                    frVar12.a.b = frVar13.b;
                }
                fr frVar14 = null;
                if (frVar14.b != null) {
                    fr frVar15 = null;
                    fr frVar16 = null;
                    frVar15.b.a = frVar16.a;
                }
                am amVar6 = null;
                if (null == amVar6.f36a) {
                    am amVar7 = null;
                    fr frVar17 = null;
                    amVar7.f36a = frVar17.b;
                }
                fr frVar18 = null;
                frVar18.a = null;
                fr frVar19 = null;
                frVar19.b = null;
                this.c--;
                am amVar8 = null;
                fh fhVar = amVar8.f37a;
                while (true) {
                    fh fhVar2 = fhVar;
                    if (fhVar2 != null) {
                        if (fhVar2.a == null) {
                            fhVar2.f377a.m183b();
                        }
                        fhVar = fhVar2.b;
                    }
                }
            }
        }
        amVar.f36a = null;
        fh fhVar3 = amVar.f37a;
        while (fhVar3 != null) {
            fh fhVar4 = fhVar3;
            fhVar3 = fhVar3.b;
            this.f43a.a(fhVar4.f377a);
        }
        amVar.f37a = null;
        ev evVar = amVar.f35a;
        while (evVar != null) {
            ev evVar2 = evVar;
            evVar = evVar.f334a;
            eh ehVar = this.f43a.a;
            if (evVar2.f337a != null) {
                ej ejVar = evVar2.f337a;
                for (int r13 = 0; r13 < ehVar.b; r13++) {
                    if (ehVar.f304a[r13] == ejVar) {
                        ehVar.f304a[r13] = null;
                        break;
                    }
                }
                ehVar.f303a--;
                ei eiVar = ehVar.a;
                eiVar.c(ejVar);
                eiVar.m164a(ejVar);
                evVar2.f337a = null;
            }
            evVar2.f336a = null;
        }
        amVar.f35a = null;
        amVar.c = 0;
        if (amVar.f33a != null) {
            amVar.f33a.f34b = amVar.f34b;
        }
        if (amVar.f34b != null) {
            amVar.f34b.f33a = amVar.f33a;
        }
        if (amVar == this.f44a) {
            this.f44a = amVar.f34b;
        }
        this.b--;
    }

    public final boolean a() {
        return (this.a & 2) == 2;
    }

    public final void a(ez ezVar) {
        ex exVar = this.f53a;
        int r1 = this.b;
        int r2 = this.f43a.f23a;
        int r3 = this.c;
        du duVar = this.f43a.f25a;
        exVar.d = r1;
        exVar.e = r2;
        exVar.f = r3;
        exVar.f348a = 0;
        exVar.c = 0;
        exVar.b = 0;
        exVar.a = duVar;
        if (exVar.f343a == null || exVar.d >= exVar.f343a.length) {
            exVar.f343a = new am[exVar.d];
        }
        if (exVar.f345a == null || exVar.f > exVar.f345a.length) {
            exVar.f345a = new fq[exVar.f];
        }
        if (exVar.f344a == null || exVar.e > exVar.f344a.length) {
            exVar.f344a = new fe[exVar.e];
        }
        if (exVar.f347a == null || exVar.d > exVar.f347a.length) {
            exVar.f347a = new fa[exVar.d];
            for (int r12 = 0; r12 < exVar.f347a.length; r12++) {
                exVar.f347a[r12] = new fa();
            }
        }
        if (exVar.f346a == null || exVar.d > exVar.f346a.length) {
            exVar.f346a = new ey[exVar.d];
            for (int r13 = 0; r13 < exVar.f346a.length; r13++) {
                exVar.f346a[r13] = new ey();
            }
        }
        am amVar = this.f44a;
        while (true) {
            am amVar2 = amVar;
            if (amVar2 == null) {
                break;
            }
            amVar2.b &= -2;
            amVar = amVar2.f34b;
        }
        fe feVar = this.f43a.f22a;
        while (true) {
            fe feVar2 = feVar;
            if (feVar2 == null) {
                break;
            }
            feVar2.a &= -2;
            feVar = feVar2.b;
        }
        fq fqVar = this.f45a;
        while (true) {
            fq fqVar2 = fqVar;
            if (fqVar2 == null) {
                break;
            }
            fqVar2.f396a = false;
            fqVar = fqVar2.b;
        }
        int r0 = this.b;
        if (this.f54a.length < r0) {
            this.f54a = new am[r0];
        }
        am amVar3 = this.f44a;
        while (true) {
            am amVar4 = amVar3;
            if (amVar4 == null) {
                break;
            }
            if ((amVar4.b & 1) != 1 && amVar4.b() && amVar4.c() && amVar4.a() != 0) {
                ex exVar2 = this.f53a;
                exVar2.f348a = 0;
                exVar2.c = 0;
                exVar2.b = 0;
                int r9 = 0 + 1;
                this.f54a[0] = amVar4;
                amVar4.b |= 1;
                while (r9 > 0) {
                    r9--;
                    am amVar5 = this.f54a[r9];
                    ex exVar3 = this.f53a;
                    int r4 = exVar3.f348a;
                    am[] amVarArr = exVar3.f343a;
                    int r5 = exVar3.f348a;
                    exVar3.f348a = r5 + 1;
                    amVarArr[r5] = amVar5;
                    amVar5.a(true);
                    if (amVar5.a() != 0) {
                        fh fhVar = amVar5.f37a;
                        while (true) {
                            fh fhVar2 = fhVar;
                            if (fhVar2 == null) {
                                break;
                            }
                            fe feVar3 = fhVar2.f377a;
                            if ((feVar3.a & 1) != 1 && feVar3.b() && feVar3.m179a()) {
                                ev evVar = feVar3.f360a;
                                ev evVar2 = feVar3.f361b;
                                ex exVar4 = this.f53a;
                                fe[] feVarArr = exVar4.f344a;
                                int r6 = exVar4.c;
                                exVar4.c = r6 + 1;
                                feVarArr[r6] = feVar3;
                                feVar3.a |= 1;
                                am amVar6 = fhVar2.a;
                                if ((amVar6.b & 1) != 1) {
                                    int r7 = r9;
                                    r9++;
                                    this.f54a[r7] = amVar6;
                                    amVar6.b |= 1;
                                }
                            }
                            fhVar = fhVar2.b;
                        }
                        fr frVar = amVar5.f36a;
                        while (true) {
                            fr frVar2 = frVar;
                            if (frVar2 != null) {
                                fq fqVar3 = null;
                                if (!fqVar3.f396a) {
                                    am amVar7 = null;
                                    if (amVar7.c()) {
                                        ex exVar5 = this.f53a;
                                        fq[] fqVarArr = exVar5.f345a;
                                        int r8 = exVar5.b;
                                        exVar5.b = r8 + 1;
                                        fqVarArr[r8] = null;
                                        fq fqVar4 = null;
                                        fqVar4.f396a = true;
                                        am amVar8 = null;
                                        if ((amVar8.b & 1) != 1) {
                                            int r10 = r9;
                                            r9++;
                                            this.f54a[r10] = null;
                                            am amVar9 = null;
                                            amVar9.b |= 1;
                                        }
                                    }
                                }
                                frVar = frVar2.b;
                            }
                        }
                    }
                }
                ex exVar6 = this.f53a;
                ap apVar = this.f46a;
                boolean z = this.f47c;
                for (int r11 = 0; r11 < exVar6.f348a; r11++) {
                    am amVar10 = exVar6.f343a[r11];
                    if (amVar10.a() == 2) {
                        amVar10.f29a.f60a += ((amVar10.f31b.f60a * amVar10.f39c) + apVar.f60a) * ezVar.a;
                        amVar10.f29a.b += ((amVar10.f31b.b * amVar10.f39c) + apVar.b) * ezVar.a;
                        amVar10.f30a += ezVar.a * amVar10.d * 0.0f;
                        float f = 1.0f - (ezVar.a * 0.0f);
                        float f2 = 0.0f > (f < 1.0f ? f : 1.0f) ? 0.0f : f < 1.0f ? f : 1.0f;
                        amVar10.f29a.f60a *= f2;
                        amVar10.f29a.b *= f2;
                        float f3 = 1.0f - (ezVar.a * amVar10.e);
                        float f4 = f3 < 1.0f ? f3 : 1.0f;
                        amVar10.f30a *= 0.0f > f4 ? 0.0f : f4;
                    }
                }
                int r14 = -1;
                for (int r15 = 0; r15 < exVar6.c; r15++) {
                    if ((exVar6.f344a[r15].m181a().a().a() == 0 || exVar6.f344a[r15].m182b().a().a() == 0) ? false : true) {
                        r14++;
                        fe feVar4 = exVar6.f344a[r14];
                        exVar6.f344a[r14] = exVar6.f344a[r15];
                        exVar6.f344a[r15] = feVar4;
                    }
                }
                exVar6.f350a.a(exVar6.f344a, exVar6.c, ezVar.c);
                exVar6.f350a.a();
                for (int r16 = 0; r16 < exVar6.b; r16++) {
                    fq[] fqVarArr2 = exVar6.f345a;
                }
                for (int r17 = 0; r17 < ezVar.f353a; r17++) {
                    for (int r18 = 0; r18 < exVar6.b; r18++) {
                        fq[] fqVarArr3 = exVar6.f345a;
                    }
                    exVar6.f350a.b();
                }
                exVar6.f350a.c();
                for (int r19 = 0; r19 < exVar6.f348a; r19++) {
                    am amVar11 = exVar6.f343a[r19];
                    if (amVar11.a() != 0) {
                        exVar6.f351b.a(amVar11.f29a, ezVar.a);
                        if (ap.m31a(exVar6.f351b, exVar6.f351b) > eq.d) {
                            amVar11.f29a.m26a(eq.c / exVar6.f351b.m29c());
                        }
                        float f5 = ezVar.a * amVar11.f30a;
                        if (f5 * f5 > 2.4674013f) {
                            amVar11.f30a *= 1.5707964f / am.a(f5);
                        }
                        amVar11.f28a.b.a(amVar11.f28a.c);
                        amVar11.f28a.f325a = amVar11.f28a.f326b;
                        exVar6.f349a.a(amVar11.f29a, ezVar.a);
                        amVar11.f28a.c.b(exVar6.f349a);
                        amVar11.f28a.f326b += ezVar.a * amVar11.f30a;
                        amVar11.m18c();
                    }
                }
                for (int r110 = 0; r110 < ezVar.f354b; r110++) {
                    boolean zM184a = exVar6.f350a.m184a();
                    boolean z2 = true;
                    for (int r111 = 0; r111 < exVar6.b; r111++) {
                        z2 = z2 && exVar6.f345a[r111].a();
                    }
                    if (zM184a && z2) {
                        break;
                    }
                }
                exVar6.a(exVar6.f350a.a);
                if (z) {
                    float fB = Float.MAX_VALUE;
                    float f6 = eq.f * eq.f;
                    for (int r112 = 0; r112 < exVar6.f348a; r112++) {
                        am amVar12 = exVar6.f343a[r112];
                        if (amVar12.a() != 0) {
                            if ((amVar12.b & 4) == 0) {
                                amVar12.f = 0.0f;
                                fB = 0.0f;
                            }
                            if ((amVar12.b & 4) == 0 || amVar12.f30a * amVar12.f30a > 0.0012184699f || ap.m31a(amVar12.f29a, amVar12.f29a) > f6) {
                                amVar12.f = 0.0f;
                                fB = 0.0f;
                            } else {
                                amVar12.f += ezVar.a;
                                fB = am.b(fB, amVar12.f);
                            }
                        }
                    }
                    if (fB >= eq.e) {
                        for (int r113 = 0; r113 < exVar6.f348a; r113++) {
                            exVar6.f343a[r113].a(false);
                        }
                    }
                }
                int r114 = this.f53a.f348a;
                while (true) {
                    int r20 = r114;
                    r114--;
                    if (r20 > 0) {
                        am amVar13 = this.f53a.f343a[r114];
                        if (amVar13.a() == 0) {
                            amVar13.b &= -2;
                        }
                    }
                }
            }
            amVar3 = amVar4.f34b;
        }
        am amVarM16a = this.f44a;
        while (true) {
            am amVar14 = amVarM16a;
            if (amVar14 == null) {
                this.f43a.a();
                return;
            }
            if ((amVar14.b & 1) != 0 && amVar14.a() != 0) {
                amVar14.m17b();
            }
            amVarM16a = amVar14.m16a();
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x06cf  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:19:0x0067  */
    public final void b(am amVar) {
        fe feVar;
        fe feVar2 = null;
        float f = 1.0f;
        am amVar2 = null;
        int r13 = 0;
        boolean zM14a = amVar.m14a();
        do {
            int r12 = 0;
            boolean z = false;
            fh fhVar = amVar.f37a;
            while (true) {
                fh fhVar2 = fhVar;
                if (fhVar2 == null) {
                    break;
                }
                if (fhVar2.f377a != feVar2) {
                    am amVar3 = fhVar2.a;
                    int r0 = amVar3.a;
                    if (zM14a) {
                        if ((amVar3.b & 64) != 0 && (r0 == 0 || (fhVar2.f377a.a & 16) == 0)) {
                            feVar = fhVar2.f377a;
                            if (!feVar.b() && feVar.f363a <= 10.0f) {
                                ev evVar = feVar.f360a;
                                ev evVar2 = feVar.f361b;
                                am amVar4 = evVar.f335a;
                                am amVar5 = evVar2.f335a;
                                this.f55a.a.a(evVar.f336a);
                                this.f55a.b.a(evVar2.f336a);
                                this.f55a.f404a.a(amVar4.f28a);
                                this.f55a.f405b.a(amVar5.f28a);
                                this.f55a.f406a = f;
                                ef.f292a.a(this.f56a, this.f55a);
                                if (this.f56a.a == 3 && this.f56a.f407a < f) {
                                    feVar2 = feVar;
                                    f = this.f56a.f407a;
                                    amVar2 = amVar3;
                                    z = true;
                                }
                                r12++;
                            }
                        }
                    } else if (r0 != 2) {
                        feVar = fhVar2.f377a;
                        if (!feVar.b()) {
                        }
                    }
                }
                fhVar = fhVar2.b;
            }
            r13++;
            if (!z || r12 <= 1) {
                break;
            }
        } while (r13 < 50);
        if (feVar2 == null) {
            amVar.m19a(1.0f);
            return;
        }
        this.f57a.a(amVar.f28a);
        amVar.m19a(f);
        feVar2.a(this.f43a.f25a);
        if (!feVar2.b()) {
            amVar.f28a.a(this.f57a);
            b(amVar);
        }
        feVar2.f363a += 1.0f;
        fe[] feVarArr = new fe[32];
        int r14 = 0;
        fh fhVar3 = amVar.f37a;
        while (true) {
            fh fhVar4 = fhVar3;
            if (fhVar4 == null || r14 >= 32) {
                break;
            }
            if (fhVar4.a.a != 2) {
                fe feVar3 = fhVar4.f377a;
                if (feVar3.b()) {
                    ev evVar3 = feVar3.f360a;
                    ev evVar4 = feVar3.f361b;
                    if (feVar3 != feVar2) {
                        feVar3.a(this.f43a.f25a);
                    }
                    if (feVar3.b() && feVar3.m179a()) {
                        feVarArr[r14] = feVar3;
                        r14++;
                    }
                }
            }
            fhVar3 = fhVar4.b;
        }
        fo foVar = this.f58a;
        foVar.f391a = r14;
        foVar.f392a = amVar;
        if (foVar.f391a >= foVar.a.length) {
            fn[] fnVarArr = foVar.a;
            foVar.a = new fn[fnVarArr.length << 1];
            az.a(fnVarArr, 0, foVar.a, 0, fnVarArr.length);
            for (int length = fnVarArr.length; length < foVar.a.length; length++) {
                foVar.a[length] = new fn();
            }
        }
        for (int r15 = 0; r15 < foVar.f391a; r15++) {
            fe feVar4 = feVarArr[r15];
            ev evVarM181a = feVar4.m181a();
            ev evVarM182b = feVar4.m182b();
            eo eoVar = evVarM181a.f336a;
            eo eoVar2 = evVarM182b.f336a;
            float f2 = eoVar.a;
            float f3 = eoVar2.a;
            am amVar6 = evVarM181a.f335a;
            am amVar7 = evVarM182b.f335a;
            eb ebVarM178a = feVar4.m178a();
            fn fnVar = foVar.a[r15];
            fnVar.f389a = amVar6;
            fnVar.f390b = amVar7;
            fnVar.f385a.m22a(ebVarM178a.f274a);
            fnVar.b.m22a(ebVarM178a.b);
            fnVar.f386a = ebVarM178a.f275a;
            fnVar.f388b = ebVarM178a.f276b;
            fnVar.f387a = f2 + f3;
            for (int r24 = 0; r24 < fnVar.f388b; r24++) {
                fnVar.a[r24] = ebVarM178a.f273a[r24].a;
            }
        }
        for (int r17 = 0; r17 < 20; r17++) {
            fo foVar2 = this.f58a;
            float fMin = 0.0f;
            for (int r16 = 0; r16 < foVar2.f391a; r16++) {
                fn fnVar2 = foVar2.a[r16];
                am amVar8 = fnVar2.f389a;
                am amVar9 = fnVar2.f390b;
                float f4 = amVar8.f38b;
                float f5 = amVar9.f38b;
                if (amVar8 == foVar2.f392a) {
                    f5 = 0.0f;
                } else {
                    f4 = 0.0f;
                }
                float f6 = f4 * amVar8.f39c;
                float f7 = f4 * amVar8.d;
                float f8 = f5 * amVar9.f39c;
                float f9 = f5 * amVar9.d;
                for (int r18 = 0; r18 < fnVar2.f388b; r18++) {
                    fp fpVar = foVar2.f393a;
                    int r2 = r18;
                    switch (fnVar2.f386a) {
                        case 0:
                            fnVar2.f389a.b(fnVar2.b, fpVar.c);
                            fnVar2.f390b.b(fnVar2.a[0], fpVar.d);
                            if (ep.a(fpVar.c, fpVar.d) > 1.4210855E-14f) {
                                fpVar.a.m22a(fpVar.d).m25c(fpVar.c);
                                fpVar.a.m27a();
                            } else {
                                fpVar.a.a(1.0f);
                            }
                            fpVar.b.m22a(fpVar.c).m24b(fpVar.d).b(0.5f);
                            fpVar.e.m22a(fpVar.d).m25c(fpVar.c);
                            fpVar.f395a = ap.m31a(fpVar.e, fpVar.a) - fnVar2.f387a;
                            break;
                        case 1:
                            fnVar2.f389a.c(fnVar2.f385a, fpVar.a);
                            fnVar2.f389a.b(fnVar2.b, fpVar.f);
                            fnVar2.f390b.b(fnVar2.a[r2], fpVar.g);
                            fpVar.e.m22a(fpVar.g).m25c(fpVar.f);
                            fpVar.f395a = ap.m31a(fpVar.e, fpVar.a) - fnVar2.f387a;
                            fpVar.b.m22a(fpVar.g);
                            break;
                        case 2:
                            fnVar2.f390b.c(fnVar2.f385a, fpVar.a);
                            fnVar2.f390b.b(fnVar2.b, fpVar.f);
                            fnVar2.f389a.b(fnVar2.a[r2], fpVar.g);
                            fpVar.e.m22a(fpVar.g).m25c(fpVar.f);
                            fpVar.f395a = ap.m31a(fpVar.e, fpVar.a) - fnVar2.f387a;
                            fpVar.b.m22a(fpVar.g);
                            fpVar.a.m23b();
                            break;
                    }
                    ap apVar = foVar2.f393a.a;
                    ap apVar2 = foVar2.f393a.b;
                    float f10 = foVar2.f393a.f395a;
                    foVar2.f394a.m22a(apVar2).m25c(amVar8.f28a.c);
                    foVar2.b.m22a(apVar2).m25c(amVar9.f28a.c);
                    fMin = Math.min(fMin, f10);
                    float fA = am.a(0.75f * (f10 + eq.a), -0.2f, 0.0f);
                    float fM32b = ap.m32b(foVar2.f394a, apVar);
                    float fM32b2 = ap.m32b(foVar2.b, apVar);
                    float f11 = f6 + f8 + (f7 * fM32b * fM32b) + (f9 * fM32b2 * fM32b2);
                    foVar2.c.m22a(apVar).b(f11 > 0.0f ? (-fA) / f11 : 0.0f);
                    foVar2.d.m22a(foVar2.c).b(f6);
                    amVar8.f28a.c.m25c(foVar2.d);
                    amVar8.f28a.f326b -= f7 * ap.m32b(foVar2.f394a, foVar2.c);
                    amVar8.m18c();
                    foVar2.d.m22a(foVar2.c).b(f8);
                    amVar9.f28a.c.m24b(foVar2.d);
                    amVar9.f28a.f326b += f9 * ap.m32b(foVar2.b, foVar2.c);
                    amVar9.m18c();
                }
            }
            if (fMin >= (-1.5f) * eq.a) {
                if (amVar2.a != 0) {
                    feVar2.a |= 16;
                }
            }
        }
        if (amVar2.a != 0) {
            feVar2.a |= 16;
        }
    }
}
