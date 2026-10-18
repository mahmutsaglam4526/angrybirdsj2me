package defpackage;

/* JADX INFO: loaded from: angrybirds_flkz3wsv.jar:fj.class */
public final class fj {

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private int f380a;

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private final eg f381a = new eg();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private ap f382a = new ap();
    private ap b = new ap();
    private final ap c = new ap();
    private ap d = new ap();
    private final ap e = new ap();
    private final ap f = new ap();
    private final ap g = new ap();
    private final ap h = new ap();
    private final ap i = new ap();
    private final ap j = new ap();
    private final ap k = new ap();
    private final ap l = new ap();
    private final ap m = new ap();

    /* JADX INFO: renamed from: a, reason: collision with other field name */
    private fm f383a = new fm();
    private ap n = new ap();
    private ap o = new ap();
    public ff[] a = new ff[256];

    public fj() {
        for (int r6 = 0; r6 < this.a.length; r6++) {
            this.a[r6] = new ff();
        }
    }

    public final void a(fe[] feVarArr, int r9, float f) {
        this.f380a = r9;
        if (this.a.length <= r9) {
            ff[] ffVarArr = new ff[this.f380a << 1];
            for (int r11 = 0; r11 < ffVarArr.length; r11++) {
                if (r11 < this.a.length) {
                    ffVarArr[r11] = this.a[r11];
                } else {
                    ffVarArr[r11] = new ff();
                }
            }
            this.a = ffVarArr;
        }
        for (int r10 = 0; r10 < this.f380a; r10++) {
            fe feVar = feVarArr[r10];
            ev evVar = feVar.f360a;
            ev evVar2 = feVar.f361b;
            eo eoVar = evVar.f336a;
            eo eoVar2 = evVar2.f336a;
            float f2 = eoVar.a;
            float f3 = eoVar2.a;
            am amVar = evVar.f335a;
            am amVar2 = evVar2.f335a;
            eb ebVarM178a = feVar.m178a();
            float fA = eq.a(evVar.b, evVar2.b);
            float fB = eq.b(evVar.c, evVar2.c);
            ap apVar = amVar.f29a;
            ap apVar2 = amVar2.f29a;
            float f4 = amVar.f30a;
            float f5 = amVar2.f30a;
            this.f381a.a(ebVarM178a, amVar.f27a, f2, amVar2.f27a, f3);
            ff ffVar = this.a[r10];
            ffVar.f367a = amVar;
            ffVar.f368b = amVar2;
            ffVar.f373a = ebVarM178a;
            ffVar.c.f60a = this.f381a.a.f60a;
            ffVar.c.b = this.f381a.a.b;
            ffVar.f372b = ebVarM178a.f276b;
            ffVar.f371b = fA;
            ffVar.f364a.f60a = ebVarM178a.f274a.f60a;
            ffVar.f364a.b = ebVarM178a.f274a.b;
            ffVar.b.f60a = ebVarM178a.b.f60a;
            ffVar.b.b = ebVarM178a.b.b;
            ffVar.f370a = f2 + f3;
            ffVar.f369a = ebVarM178a.f275a;
            for (int r14 = 0; r14 < ffVar.f372b; r14++) {
                fz fzVar = ebVarM178a.f273a[r14];
                fg fgVar = ffVar.a[r14];
                fgVar.f374a = f * fzVar.f398a;
                fgVar.f375b = f * fzVar.b;
                fgVar.a.f60a = fzVar.a.f60a;
                fgVar.a.b = fzVar.a.b;
                fgVar.b.f60a = this.f381a.f302a[r14].f60a - amVar.f28a.c.f60a;
                fgVar.b.b = this.f381a.f302a[r14].b - amVar.f28a.c.b;
                fgVar.c.f60a = this.f381a.f302a[r14].f60a - amVar2.f28a.c.f60a;
                fgVar.c.b = this.f381a.f302a[r14].b - amVar2.f28a.c.b;
                float f6 = (fgVar.b.f60a * ffVar.c.b) - (fgVar.b.b * ffVar.c.f60a);
                float f7 = (fgVar.c.f60a * ffVar.c.b) - (fgVar.c.b * ffVar.c.f60a);
                fgVar.f376c = 1.0f / (((amVar.f39c + amVar2.f39c) + (amVar.d * (f6 * f6))) + (amVar2.d * (f7 * f7)));
                this.f382a.f60a = 1.0f * ffVar.c.b;
                this.f382a.b = (-1.0f) * ffVar.c.f60a;
                float f8 = (fgVar.b.f60a * this.f382a.b) - (fgVar.b.b * this.f382a.f60a);
                float f9 = (fgVar.c.f60a * this.f382a.b) - (fgVar.c.b * this.f382a.f60a);
                fgVar.d = 1.0f / (((amVar.f39c + amVar2.f39c) + (amVar.d * (f8 * f8))) + (amVar2.d * (f9 * f9)));
                fgVar.e = 0.0f;
                this.c.f60a = (-f4) * fgVar.b.b;
                this.c.b = f4 * fgVar.b.f60a;
                this.b.f60a = ((((-f5) * fgVar.c.b) + apVar2.f60a) - apVar.f60a) - this.c.f60a;
                this.b.b = (((f5 * fgVar.c.f60a) + apVar2.b) - apVar.b) - this.c.b;
                ap apVar3 = ffVar.c;
                float f10 = (apVar3.f60a * this.b.f60a) + (apVar3.b * this.b.b);
                if (f10 < -1.0f) {
                    fgVar.e = (-fB) * f10;
                }
            }
            if (ffVar.f372b == 2) {
                fg fgVar2 = ffVar.a[0];
                fg fgVar3 = ffVar.a[1];
                float f11 = amVar.f39c;
                float f12 = amVar.d;
                float f13 = amVar2.f39c;
                float f14 = amVar2.d;
                float fM32b = ap.m32b(fgVar2.b, ffVar.c);
                float fM32b2 = ap.m32b(fgVar2.c, ffVar.c);
                float fM32b3 = ap.m32b(fgVar3.b, ffVar.c);
                float fM32b4 = ap.m32b(fgVar3.c, ffVar.c);
                float f15 = f11 + f13 + (f12 * fM32b * fM32b) + (f14 * fM32b2 * fM32b2);
                float f16 = f11 + f13 + (f12 * fM32b3 * fM32b3) + (f14 * fM32b4 * fM32b4);
                float f17 = f11 + f13 + (f12 * fM32b * fM32b3) + (f14 * fM32b2 * fM32b4);
                if (f15 * f15 < 100.0f * ((f15 * f16) - (f17 * f17))) {
                    ffVar.f366b.a.f60a = f15;
                    ffVar.f366b.a.b = f17;
                    ffVar.f366b.b.f60a = f17;
                    ffVar.f366b.b.b = f16;
                    ffVar.f365a.a.f60a = ffVar.f366b.a.f60a;
                    ffVar.f365a.a.b = ffVar.f366b.a.b;
                    ffVar.f365a.b.f60a = ffVar.f366b.b.f60a;
                    ffVar.f365a.b.b = ffVar.f366b.b.b;
                    ffVar.f365a.a();
                } else {
                    ffVar.f372b = 1;
                }
            }
        }
    }

    public final void a() {
        for (int r8 = 0; r8 < this.f380a; r8++) {
            ff ffVar = this.a[r8];
            am amVar = ffVar.f367a;
            am amVar2 = ffVar.f368b;
            float f = amVar.f39c;
            float f2 = amVar.d;
            float f3 = amVar2.f39c;
            float f4 = amVar2.d;
            ap apVar = ffVar.c;
            this.f382a.b(apVar, 1.0f);
            for (int r17 = 0; r17 < ffVar.f372b; r17++) {
                fg fgVar = ffVar.a[r17];
                float f5 = (fgVar.f374a * apVar.f60a) + (fgVar.f375b * this.f382a.f60a);
                float f6 = (fgVar.f374a * apVar.b) + (fgVar.f375b * this.f382a.b);
                amVar.f30a -= f2 * ((fgVar.b.f60a * f6) - (fgVar.b.b * f5));
                amVar.f29a.f60a -= f5 * f;
                amVar.f29a.b -= f6 * f;
                amVar2.f30a += f4 * ((fgVar.c.f60a * f6) - (fgVar.c.b * f5));
                amVar2.f29a.f60a += f5 * f3;
                amVar2.f29a.b += f6 * f3;
            }
        }
    }

    public final void b() {
        for (int r7 = 0; r7 < this.f380a; r7++) {
            ff ffVar = this.a[r7];
            am amVar = ffVar.f367a;
            am amVar2 = ffVar.f368b;
            float fM32b = amVar.f30a;
            float fM32b2 = amVar2.f30a;
            ap apVar = amVar.f29a;
            ap apVar2 = amVar2.f29a;
            float f = amVar.f39c;
            float f2 = amVar.d;
            float f3 = amVar2.f39c;
            float f4 = amVar2.d;
            this.f382a.f60a = 1.0f * ffVar.c.b;
            this.f382a.b = (-1.0f) * ffVar.c.f60a;
            float f5 = ffVar.f371b;
            for (int r20 = 0; r20 < ffVar.f372b; r20++) {
                fg fgVar = ffVar.a[r20];
                ap apVar3 = fgVar.b;
                this.e.f60a = ((((-fM32b2) * fgVar.c.b) + apVar2.f60a) - apVar.f60a) + (fM32b * apVar3.b);
                this.e.b = (((fM32b2 * fgVar.c.f60a) + apVar2.b) - apVar.b) - (fM32b * apVar3.f60a);
                float f6 = fgVar.d * (-((this.e.f60a * this.f382a.f60a) + (this.e.b * this.f382a.b)));
                float f7 = f5 * fgVar.f374a;
                float fA = am.a(fgVar.f375b + f6, -f7, f7);
                float f8 = fA - fgVar.f375b;
                float f9 = this.f382a.f60a * f8;
                float f10 = this.f382a.b * f8;
                apVar.f60a -= f9 * f;
                apVar.b -= f10 * f;
                fM32b -= f2 * ((fgVar.b.f60a * f10) - (fgVar.b.b * f9));
                apVar2.f60a += f9 * f3;
                apVar2.b += f10 * f3;
                fM32b2 += f4 * ((fgVar.c.f60a * f10) - (fgVar.c.b * f9));
                fgVar.f375b = fA;
            }
            if (ffVar.f372b == 1) {
                fg fgVar2 = ffVar.a[0];
                ap apVar4 = fgVar2.b;
                this.e.f60a = ((((-fM32b2) * fgVar2.c.b) + apVar2.f60a) - apVar.f60a) + (fM32b * apVar4.b);
                this.e.b = (((fM32b2 * fgVar2.c.f60a) + apVar2.b) - apVar.b) - (fM32b * apVar4.f60a);
                ap apVar5 = ffVar.c;
                float f11 = fgVar2.f374a + ((-fgVar2.f376c) * (((this.e.f60a * apVar5.f60a) + (this.e.b * apVar5.b)) - fgVar2.e));
                float f12 = f11 > 0.0f ? f11 : 0.0f;
                float f13 = f12;
                float f14 = f12 - fgVar2.f374a;
                float f15 = ffVar.c.f60a * f14;
                float f16 = ffVar.c.b * f14;
                apVar.f60a -= f15 * f;
                apVar.b -= f16 * f;
                fM32b -= f2 * ((fgVar2.b.f60a * f16) - (fgVar2.b.b * f15));
                apVar2.f60a += f15 * f3;
                apVar2.b += f16 * f3;
                fM32b2 += f4 * ((fgVar2.c.f60a * f16) - (fgVar2.c.b * f15));
                fgVar2.f374a = f13;
            } else {
                fg fgVar3 = ffVar.a[0];
                fg fgVar4 = ffVar.a[1];
                this.f.f60a = fgVar3.f374a;
                this.f.b = fgVar4.f374a;
                this.h.f60a = ((((-fM32b2) * fgVar3.c.b) + apVar2.f60a) - apVar.f60a) + (fM32b * fgVar3.b.b);
                this.h.b = (((fM32b2 * fgVar3.c.f60a) + apVar2.b) - apVar.b) - (fM32b * fgVar3.b.f60a);
                this.i.f60a = ((((-fM32b2) * fgVar4.c.b) + apVar2.f60a) - apVar.f60a) + (fM32b * fgVar4.b.b);
                this.i.b = (((fM32b2 * fgVar4.c.f60a) + apVar2.b) - apVar.b) - (fM32b * fgVar4.b.f60a);
                float f17 = (this.h.f60a * ffVar.c.f60a) + (this.h.b * ffVar.c.b);
                float f18 = (this.i.f60a * ffVar.c.f60a) + (this.i.b * ffVar.c.b);
                this.g.f60a = f17 - fgVar3.e;
                this.g.b = f18 - fgVar4.e;
                this.c.f60a = (ffVar.f366b.a.f60a * this.f.f60a) + (ffVar.f366b.b.f60a * this.f.b);
                this.c.b = (ffVar.f366b.a.b * this.f.f60a) + (ffVar.f366b.b.b * this.f.b);
                this.g.f60a -= this.c.f60a;
                this.g.b -= this.c.b;
                al.a(ffVar.f365a, this.g, this.j);
                this.j.b(-1.0f);
                if (this.j.f60a < 0.0f || this.j.b < 0.0f) {
                    this.j.f60a = (-fgVar3.f376c) * this.g.f60a;
                    this.j.b = 0.0f;
                    float f19 = (ffVar.f366b.a.b * this.j.f60a) + this.g.b;
                    if (this.j.f60a < 0.0f || f19 < 0.0f) {
                        this.j.f60a = 0.0f;
                        this.j.b = (-fgVar4.f376c) * this.g.b;
                        float f20 = (ffVar.f366b.b.f60a * this.j.b) + this.g.f60a;
                        if (this.j.b < 0.0f || f20 < 0.0f) {
                            this.j.f60a = 0.0f;
                            this.j.b = 0.0f;
                            float f21 = this.g.f60a;
                            float f22 = this.g.b;
                            if (f21 >= 0.0f && f22 >= 0.0f) {
                                this.k.b(this.j, this.f);
                                this.l.a(ffVar.c, this.k.f60a);
                                this.m.a(ffVar.c, this.k.b);
                                this.b.a(this.l, this.m);
                                this.c.a(this.b, f);
                                apVar.c(this.c);
                                this.c.a(this.b, f3);
                                apVar2.b(this.c);
                                fM32b -= f2 * (ap.m32b(fgVar3.b, this.l) + ap.m32b(fgVar4.b, this.m));
                                fM32b2 += f4 * (ap.m32b(fgVar3.c, this.l) + ap.m32b(fgVar4.c, this.m));
                                fgVar3.f374a = this.j.f60a;
                                fgVar4.f374a = this.j.b;
                            }
                        } else {
                            this.k.b(this.j, this.f);
                            this.l.a(ffVar.c, this.k.f60a);
                            this.m.a(ffVar.c, this.k.b);
                            this.b.a(this.l, this.m);
                            this.c.a(this.b, f);
                            apVar.c(this.c);
                            this.c.a(this.b, f3);
                            apVar2.b(this.c);
                            fM32b -= f2 * (ap.m32b(fgVar3.b, this.l) + ap.m32b(fgVar4.b, this.m));
                            fM32b2 += f4 * (ap.m32b(fgVar3.c, this.l) + ap.m32b(fgVar4.c, this.m));
                            fgVar3.f374a = this.j.f60a;
                            fgVar4.f374a = this.j.b;
                        }
                    } else {
                        this.k.b(this.j, this.f);
                        this.l.a(ffVar.c, this.k.f60a);
                        this.m.a(ffVar.c, this.k.b);
                        this.b.a(this.l, this.m);
                        this.c.a(this.b, f);
                        apVar.c(this.c);
                        this.c.a(this.b, f3);
                        apVar2.b(this.c);
                        fM32b -= f2 * (ap.m32b(fgVar3.b, this.l) + ap.m32b(fgVar4.b, this.m));
                        fM32b2 += f4 * (ap.m32b(fgVar3.c, this.l) + ap.m32b(fgVar4.c, this.m));
                        fgVar3.f374a = this.j.f60a;
                        fgVar4.f374a = this.j.b;
                    }
                } else {
                    this.k.b(this.j, this.f);
                    this.l.a(ffVar.c, this.k.f60a);
                    this.m.a(ffVar.c, this.k.b);
                    this.b.a(this.l, this.m);
                    this.c.a(this.b, f);
                    apVar.c(this.c);
                    this.c.a(this.b, f3);
                    apVar2.b(this.c);
                    fM32b -= f2 * (ap.m32b(fgVar3.b, this.l) + ap.m32b(fgVar4.b, this.m));
                    fM32b2 += f4 * (ap.m32b(fgVar3.c, this.l) + ap.m32b(fgVar4.c, this.m));
                    fgVar3.f374a = this.j.f60a;
                    fgVar4.f374a = this.j.b;
                }
            }
            amVar.f29a.a(apVar);
            amVar.f30a = fM32b;
            amVar2.f29a.a(apVar2);
            amVar2.f30a = fM32b2;
        }
    }

    public final void c() {
        for (int r5 = 0; r5 < this.f380a; r5++) {
            ff ffVar = this.a[r5];
            eb ebVar = ffVar.f373a;
            for (int r8 = 0; r8 < ffVar.f372b; r8++) {
                ebVar.f273a[r8].f398a = ffVar.a[r8].f374a;
                ebVar.f273a[r8].b = ffVar.a[r8].f375b;
            }
        }
    }

    /* JADX INFO: renamed from: a, reason: collision with other method in class */
    public final boolean m184a() {
        float fMin = 0.0f;
        for (int r8 = 0; r8 < this.f380a; r8++) {
            ff ffVar = this.a[r8];
            am amVar = ffVar.f367a;
            am amVar2 = ffVar.f368b;
            float f = amVar.f38b * amVar.f39c;
            float f2 = amVar.f38b * amVar.d;
            float f3 = amVar2.f38b * amVar2.f39c;
            float f4 = amVar2.f38b * amVar2.d;
            for (int r16 = 0; r16 < ffVar.f372b; r16++) {
                fm fmVar = this.f383a;
                int r2 = r16;
                switch (ffVar.f369a) {
                    case 0:
                        ffVar.f367a.b(ffVar.b, fmVar.c);
                        ffVar.f368b.b(ffVar.a[0].a, fmVar.d);
                        if (ep.a(fmVar.c, fmVar.d) > 1.4210855E-14f) {
                            fmVar.a.b(fmVar.d, fmVar.c);
                            fmVar.a.m27a();
                        } else {
                            fmVar.a.a(1.0f, 0.0f);
                        }
                        fmVar.b.a(fmVar.c, fmVar.d);
                        fmVar.b.m26a(0.5f);
                        fmVar.e.b(fmVar.d, fmVar.c);
                        fmVar.f384a = ap.m31a(fmVar.e, fmVar.a) - ffVar.f370a;
                        break;
                    case 1:
                        ffVar.f367a.c(ffVar.f364a, fmVar.a);
                        ffVar.f367a.b(ffVar.b, fmVar.f);
                        ffVar.f368b.b(ffVar.a[r2].a, fmVar.g);
                        fmVar.e.b(fmVar.g, fmVar.f);
                        fmVar.f384a = ap.m31a(fmVar.e, fmVar.a) - ffVar.f370a;
                        fmVar.b.a(fmVar.g);
                        break;
                    case 2:
                        ffVar.f368b.c(ffVar.f364a, fmVar.a);
                        ffVar.f368b.b(ffVar.b, fmVar.f);
                        ffVar.f367a.b(ffVar.a[r2].a, fmVar.g);
                        fmVar.e.b(fmVar.g, fmVar.f);
                        fmVar.f384a = ap.m31a(fmVar.e, fmVar.a) - ffVar.f370a;
                        fmVar.b.a(fmVar.g);
                        fmVar.a.b();
                        break;
                }
                ap apVar = fmVar.a;
                ap apVar2 = fmVar.b;
                float f5 = fmVar.f384a;
                this.n.b(apVar2, amVar.f28a.c);
                this.o.b(apVar2, amVar2.f28a.c);
                fMin = Math.min(fMin, f5);
                float fA = am.a(0.2f * (f5 + eq.a), -0.2f, 0.0f);
                float fM30a = this.n.m30a(apVar);
                float fM30a2 = this.o.m30a(apVar);
                float f6 = f + f3 + (f2 * fM30a * fM30a) + (f4 * fM30a2 * fM30a2);
                this.d.a(apVar, f6 > 0.0f ? (-fA) / f6 : 0.0f);
                this.b.a(this.d, f);
                amVar.f28a.c.c(this.b);
                amVar.f28a.f326b -= f2 * this.n.m30a(this.d);
                amVar.m18c();
                this.b.a(this.d, f3);
                amVar2.f28a.c.b(this.b);
                amVar2.f28a.f326b += f4 * this.o.m30a(this.d);
                amVar2.m18c();
            }
        }
        return fMin >= (-1.5f) * eq.a;
    }
}
