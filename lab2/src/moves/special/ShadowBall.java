package moves.special;

import ru.ifmo.se.pokemon.*;

/**
 * Inflicts regular damage. Has a 10% chance to burn the target.
 */
public class ShadowBall extends SpecialMove {
    public ShadowBall() {
        super(Type.GHOST,80,100);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().chance(0.2).stat(Stat.SPECIAL_DEFENSE, -1));
    }

    @Override
    protected String describe() {
        return "ShadowCringe";
    }
}